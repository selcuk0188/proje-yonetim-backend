package com.proje.yonetim.entities;


public class KullaniciDersList {
    private Integer id;
    private Integer dersId;
    private String dersAdi;
    private Integer kullaniciId;
    private String kullaniciAdSoyad;
    private String kullaniciRol;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Integer kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getKullaniciAdSoyad() {
        return kullaniciAdSoyad;
    }

    public void setKullaniciAdSoyad(String kullaniciAdSoyad) {
        this.kullaniciAdSoyad = kullaniciAdSoyad;
    }

    public String getKullaniciRol() {
        return kullaniciRol;
    }

    public void setKullaniciRol(String kullaniciRol) {
        this.kullaniciRol = kullaniciRol;
    }
}
