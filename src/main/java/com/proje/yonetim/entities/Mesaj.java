package com.proje.yonetim.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "mesaj")
public class Mesaj {

    @Id
    private Integer id;

    @Column(name = "mesaj_basligi")
    private String mesajbasligi;

    @Column(name = "mesaj_konusu")
    private String mesajkonusu;

    @Column(name = "mesaj_icerigi")
    private String mesajicerigi;

    @Column(name = "yeni_mesaj_mi")
    private String yenimesajmi;

    @Column(name = "dosya_eki_var_mi")
    private String dosyaekivarmi;

    @Column(name = "dosya_icerigi")
    private String dosyaicerigi;

    @Column(name = "gonderen_kullanici_id")
    private String gonderenkullaniciid;

    @Column(name = "gonderilen_kullanici_id")
    private String gönderilenkullaniciid;

    @Column(name = "okuyan_sayisi")
    private Integer okuyansayisi;

    @Column(name = "okumayan_sayisi")
    private Integer okumayansayisi;

    @Column(name = "durum")
    private String durum;

    @Column(name = "tarih")
    private Date tarih;


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

    public String getMesajkonusu() {
        return mesajkonusu;
    }

    public void setMesajkonusu(String mesajkonusu) {
        this.mesajkonusu = mesajkonusu;
    }

    public String getMesajicerigi() {
        return mesajicerigi;
    }

    public void setMesajicerigi(String mesajicerigi) {
        this.mesajicerigi = mesajicerigi;
    }

    public String getYenimesajmi() {
        return yenimesajmi;
    }

    public void setYenimesajmi(String yenimesajmi) {
        this.yenimesajmi = yenimesajmi;
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

    public String getGonderenkullaniciid() {
        return gonderenkullaniciid;
    }

    public void setGonderenkullaniciid(String gonderenkullaniciid) {
        this.gonderenkullaniciid = gonderenkullaniciid;
    }

    public String getGönderilenkullaniciid() {
        return gönderilenkullaniciid;
    }

    public void setGönderilenkullaniciid(String gönderilenkullaniciid) {
        this.gönderilenkullaniciid = gönderilenkullaniciid;
    }

    public Integer getOkuyansayisi() {
        return okuyansayisi;
    }

    public void setOkuyansayisi(Integer okuyansayisi) {
        this.okuyansayisi = okuyansayisi;
    }

    public Integer getOkumayansayisi() {
        return okumayansayisi;
    }

    public void setOkumayansayisi(Integer okumayansayisi) {
        this.okumayansayisi = okumayansayisi;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }
}
