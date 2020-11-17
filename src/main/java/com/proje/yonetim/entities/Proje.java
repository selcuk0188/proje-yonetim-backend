package com.proje.yonetim.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proje")
public class Proje {

    @Id
    private Integer id;

    @Column(name = "ders_id")
    private String dersid;

    @Column(name = "proje_adi")
    private String projeAdi;

    @Column(name = "durum")
    private String durum;

    @Column(name = "son_islem")
    private String sonIslem;

    @Column(name = "son_islem_tarihi")
    private String sonIslemTarihi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDersid() {
        return dersid;
    }

    public void setDersid(String dersid) {
        this.dersid = dersid;
    }

    public String getProjeAdi() {
        return projeAdi;
    }

    public void setProjeAdi(String projeAdi) {
        this.projeAdi = projeAdi;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public String getSonIslem() {
        return sonIslem;
    }

    public void setSonIslem(String sonIslem) {
        this.sonIslem = sonIslem;
    }

    public String getSonIslemTarihi() {
        return sonIslemTarihi;
    }

    public void setSonIslemTarihi(String sonIslemTarihi) {
        this.sonIslemTarihi = sonIslemTarihi;
    }
}
