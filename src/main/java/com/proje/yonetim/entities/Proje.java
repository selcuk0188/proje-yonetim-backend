package com.proje.yonetim.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "proje")
public class Proje {

    @Id
    private Integer id;

    @Column(name = "proje_adi")
    private String projeAdi;

    @Column(name = "son_islem")
    private Date sonIslem;

    @Column(name = "son_islem_tarihi")
    private String sonIslemTarihi;

    @Column(name = "kullanici_id")
    private Integer kullaniciId;

    @OneToOne
    @JoinColumn(name = "ders_id", referencedColumnName = "id")
    private Ders dersid;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "proje_id")
    private ProjeOnay projeOnay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjeAdi() {
        return projeAdi;
    }

    public void setProjeAdi(String projeAdi) {
        this.projeAdi = projeAdi;
    }

    public Date getSonIslem() {
        return sonIslem;
    }

    public void setSonIslem(Date sonIslem) {
        this.sonIslem = sonIslem;
    }

    public String getSonIslemTarihi() {
        return sonIslemTarihi;
    }

    public void setSonIslemTarihi(String sonIslemTarihi) {
        this.sonIslemTarihi = sonIslemTarihi;
    }

    public Ders getDersid() {
        return dersid;
    }

    public void setDersid(Ders dersid) {
        this.dersid = dersid;
    }

    public ProjeOnay getProjeOnay() {
        return projeOnay;
    }

    public void setProjeOnay(ProjeOnay projeOnay) {
        this.projeOnay = projeOnay;
    }

    public Integer getkullaniciId() {
        return kullaniciId;
    }

    public void setkullaniciId(Integer kullaniciId) {
        this.kullaniciId = kullaniciId;
    }
}
