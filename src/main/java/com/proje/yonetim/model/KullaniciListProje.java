package com.proje.yonetim.model;


import com.proje.yonetim.entities.Proje;

public class KullaniciListProje {

    private Integer id;
    private String adSoyad;
    private String kullaniciAdi;
    private String sifre;
    private String durum;
    private String tcNo;
    private Integer dersId;
    private String dersAdi;
    private Proje proje;

    public Proje getProje() {
        return proje;
    }

    public void setProje(Proje proje) {
        this.proje = proje;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }


    public Integer getDersId() {
        return dersId;
    }

    public void setDersId(Integer dersId) {
        this.dersId = dersId;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }
}
