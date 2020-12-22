package com.proje.yonetim.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mesaj")
public class Mesaj {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "mesaj_basligi")
    private String mesajbasligi;

    @Column(name = "mesaj_icerigi")
    private String mesajicerigi;

    @Column(name = "dosya_eki_var_mi")
    private String dosyaekivarmi;

    @Column(name = "dosya_icerigi")
    private String dosyaicerigi;

    @Column(name = "gonderen_kullanici_id")
    private Integer gonderenkullaniciid;

    @Column(name = "gonderilen_kullanici_id")
    private Integer gonderilenkullaniciid;

    @Column(name = "yeni_mesaj_mi")
    private String yenimesajmi;

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
