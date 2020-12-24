package com.proje.yonetim.model;


public class MesajDto {

    private Integer id;
    private String mesajbasligi;
    private String mesajicerigi;
    private String dosyaekivarmi;
    private String dosyaicerigi;
    private Integer gonderenkullaniciid;
    private Integer gonderilenkullaniciid;
    private String yenimesajmi;
    private String durum;
    private String tarih;
    private String gonderenAdSoyad;
    private String gonderilenAdSoyad;

    public String getGonderenAdSoyad() {
        return gonderenAdSoyad;
    }

    public void setGonderenAdSoyad(String gonderenAdSoyad) {
        this.gonderenAdSoyad = gonderenAdSoyad;
    }

    public String getGonderilenAdSoyad() {
        return gonderilenAdSoyad;
    }

    public void setGonderilenAdSoyad(String gonderilenAdSoyad) {
        this.gonderilenAdSoyad = gonderilenAdSoyad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
}
