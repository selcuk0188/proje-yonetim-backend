package com.proje.yonetim.model;


import com.proje.yonetim.entities.Proje;

import java.util.List;

public class KullaniciListProjeResponse {

    List<KullaniciListProje> kullaniciList;

    public List<KullaniciListProje> getKullaniciList() {
        return kullaniciList;
    }

    public void setKullaniciList(List<KullaniciListProje> kullaniciList) {
        this.kullaniciList = kullaniciList;
    }
}
