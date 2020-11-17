package com.proje.yonetim.service;

import com.proje.yonetim.entities.Mesaj;
import com.proje.yonetim.entities.Rol;
import com.proje.yonetim.model.MesajResponse;
import com.proje.yonetim.model.RolResponse;
import com.proje.yonetim.repository.MesajRepository;
import com.proje.yonetim.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesajService {

    @Autowired
    private MesajRepository mesajRepository;

    public MesajResponse getMesaj() {
        MesajResponse response = new MesajResponse();
        List<Mesaj> mesajList = mesajRepository.findAll();
        response.setMesajList(mesajList);
        return response;

    }


}
