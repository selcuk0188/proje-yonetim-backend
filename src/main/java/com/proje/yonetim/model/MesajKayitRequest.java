package com.proje.yonetim.model;


public class MesajKayitRequest {

    private String mesajbasligi;
    private String mesajicerigi;
    private String dosyaekivarmi;
    private String dosyaicerigi;
    private Integer gonderenkullaniciid;
    private Integer gonderilenkullaniciid;
    private String yenimesajmi;

    public String getMesajbasligi() {
        return mesajbasligi;
    }

    public void setMesajbasligi(String mesajbasligi) {
        this.mesajbasligi = mesajbasligi;
    }

    public String getMesajicerigi() {
        return mesajicerigi;
    }

    public void setMesajicerigi(String mesajicerigi) {
        this.mesajicerigi = mesajicerigi;
    }

    public String getDosyaekivarmi() {
        return dosyaekivarmi;
    }

    public void setDosyaekivarmi(String dosyaekivarmi) {
        this.dosyaekivarmi = dosyaekivarmi;
    }

    public String getDosyaicerigi() {
        return dosyaicerigi;
    }

    public void setDosyaicerigi(String dosyaicerigi) {
        this.dosyaicerigi = dosyaicerigi;
    }

    public Integer getGonderenkullaniciid() {
        return gonderenkullaniciid;
    }

    public void setGonderenkullaniciid(Integer gonderenkullaniciid) {
        this.gonderenkullaniciid = gonderenkullaniciid;
    }

    public Integer getGonderilenkullaniciid() {
        return gonderilenkullaniciid;
    }

    public void setGonderilenkullaniciid(Integer gonderilenkullaniciid) {
        this.gonderilenkullaniciid = gonderilenkullaniciid;
    }

    public String getYenimesajmi() {
        return yenimesajmi;
    }

    public void setYenimesajmi(String yenimesajmi) {
        this.yenimesajmi = yenimesajmi;
    }
}
