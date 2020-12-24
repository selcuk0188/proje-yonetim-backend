package com.proje.yonetim.model;

import com.proje.yonetim.entities.Mesaj;
import com.proje.yonetim.entities.Rol;

import java.util.List;

public class MesajResponse {

    private List<MesajDto> mesajList;

    public List<MesajDto> getMesajList() {
        return mesajList;
    }

    public void setMesajList(List<MesajDto> mesajList) {
        this.mesajList = mesajList;
    }
}
