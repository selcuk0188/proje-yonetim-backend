package com.proje.yonetim.model;

public class DersKayitResponse {        // model: databaseden alına objeyi onyuze donmesi icin gerekli olan obje 
                                         // önzyüze dönülen ders kayit objesi

    private boolean isBasariliMi;

    public boolean isBasariliMi() {
        return isBasariliMi;
    }

    public void setBasariliMi(boolean basariliMi) {
        isBasariliMi = basariliMi;
    }
}
