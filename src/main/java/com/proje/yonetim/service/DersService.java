package com.proje.yonetim.service;

import com.proje.yonetim.entities.Ders;
import com.proje.yonetim.model.DersKayitResponse;
import com.proje.yonetim.model.DersResponse;
import com.proje.yonetim.repository.DersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DersService {

    @Autowired
    private DersRepository dersRepository;

    public DersResponse getDers() {                     // Tüm dersleri veritabanından getirir
        DersResponse response = new DersResponse();
        List<Ders> dersList = dersRepository.findAll();
        response.setDersList(dersList);
        return response;
    }

    public DersKayitResponse saveDers(Ders ders) {      // Dersi veritabanına kaydeder
        DersKayitResponse response = new DersKayitResponse();
        dersRepository.save(ders);
        response.setBasariliMi(true);
        return response;

    }

}
