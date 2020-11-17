package com.proje.yonetim.model;

import com.proje.yonetim.entities.Ders;
import com.proje.yonetim.entities.Proje;

import java.util.List;

public class DersResponse {

    private List<Ders> dersList;

    public List<Ders> getDersList() {
        return dersList;
    }

    public void setDersList(List<Ders> dersList) {
        this.dersList = dersList;
    }
}
