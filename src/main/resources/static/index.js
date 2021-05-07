function registrert(){
    const sId = $("#sId").val();
    const fId=$("#fId").val();
    const karakter=$("#karakter").val();
    const prosent =$("#prosent").val();
    const aar = $("#aar").val();

    const dataen={
        Sid: sId,
        Fid:fId,
        Karakter:karakter,
        Prosent:prosent,
        Aar:aar
    }
if(skjekkSid(sId) && skjekkFid(fId)){$.post("/lagre",dataen,function(){})}
}

function skjekkSid(sIdvar){
    $("#feilsId").html("")
    const regEx =/^[0-9]{6}$/;
    const OK = regEx.test(sIdvar);
    if (!OK){
        $("#feilsId").html("Not accepted. Enter six digits.")
    //Divs are always either html or texts.
    return false;
    }
    else{
        return true;
    }
}

function skjekkFid(fIdvar){
    $("#feilfId").html("")
    const regEx =/^[A-Z]{4}[0-9]{4}$/;
    const OK = regEx.test(fIdvar);
    if (!OK){
        $("#feilfId").html("Not accepted. Enter four letters followed by four digits.")
        //Divs are always either html or texts.
        return false;
    }
    else{
        return true;
    }
}



/*^ - carret
$ - dollar sign
[] - square brackets
{} - curly braces
() - parenteces
< > - angle brackets
'' - sing quoteation mark
: - colon
; - semi colon
"" - double quotes
|| - or
&& - and
/ - slash
*/