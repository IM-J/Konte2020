package com.example.demo;

public class Data {
    private String Sid;
    private String Fid;
    private String Navn;
    private String Aar;
    private String Karakter;
    private String Prosent;

    public Data(String sid, String fid, String navn, String aar, String karakter, String prosent) {
        Sid = sid;
        Fid = fid;
        Navn = navn;
        Aar = aar;
        Karakter = karakter;
        Prosent = prosent;
    }
    public Data(){

    }

    public String getSid() {
        return Sid;
    }

    public void setSid(String sid) {
        Sid = sid;
    }

    public String getFid() {
        return Fid;
    }

    public void setFid(String fid) {
        Fid = fid;
    }

    public String getNavn() {
        return Navn;
    }

    public void setNavn(String navn) {
        Navn = navn;
    }

    public String getAar() {
        return Aar;
    }

    public void setAar(String aar) {
        Aar = aar;
    }

    public String getKarakter() {
        return Karakter;
    }

    public void setKarakter(String karakter) {
        Karakter = karakter;
    }

    public String getProsent() {
        return Prosent;
    }

    public void setProsent(String prosent) {
        Prosent = prosent;
    }
}
