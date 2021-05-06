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
    $.post("/lagre",dataen,function(){})


}