package com.proje.yonetim.service;

import com.proje.yonetim.entities.Mesaj;
import com.proje.yonetim.model.MesajKayitRequest;
import com.proje.yonetim.model.MesajKayitResponse;
import com.proje.yonetim.model.MesajResponse;
import com.proje.yonetim.repository.MesajRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        mesaj.setDurum("aktif");
        mesaj.setTarih(formattedDate());
        mesajRepository.save(mesaj);
        response.setSaved(true);
        return response;
    }

    private String formattedDate() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
        return myDateObj.format(myFormatObj);
    }

    public MesajResponse getMesajBykullaniciId(Integer kullaniciId, Integer kim) {
        MesajResponse response = new MesajResponse();
        List<Mesaj> mesajList = null;
        if (kim == 1)
            mesajList = mesajRepository.findByGonderenkullaniciid(kullaniciId);
        else
            mesajList = mesajRepository.findByGonderilenkullaniciid(kullaniciId);
        response.setMesajList(mesajList);
        return response;
    }


}
