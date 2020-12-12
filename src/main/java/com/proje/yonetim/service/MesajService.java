package com.proje.yonetim.service;

import com.proje.yonetim.entities.Mesaj;
import com.proje.yonetim.model.MesajKayitResponse;
import com.proje.yonetim.model.MesajResponse;
import com.proje.yonetim.repository.MesajRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesajService {

    @Autowired
    private MesajRepository mesajRepository;

    public MesajResponse getMesajList() {
        MesajResponse response = new MesajResponse();
        List<Mesaj> mesajList = mesajRepository.findAll();
        response.setMesajList(mesajList);
        return response;

    }

    public MesajKayitResponse mesajKayit(Mesaj mesaj) {
        MesajKayitResponse response = new MesajKayitResponse();
        mesajRepository.save(mesaj);
        response.setSaved(true);
        return response;
    }

    public MesajResponse getMesajBykullaniciId(Integer kullaniciId) {
        MesajResponse response = new MesajResponse();
        List<Mesaj> mesajList = mesajRepository.findBykullaniciId(kullaniciId);
        response.setMesajList(mesajList);
        return response;
    }


}
