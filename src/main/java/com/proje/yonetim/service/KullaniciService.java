package com.proje.yonetim.service;

import com.proje.yonetim.entities.Kullanici;
import com.proje.yonetim.model.KullaniciRequest;
import com.proje.yonetim.model.KullaniciResponse;
import com.proje.yonetim.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KullaniciService {

    @Autowired
    private KullaniciRepository kullaniciRepository;

    public KullaniciResponse getKullanici(KullaniciRequest request) {
        KullaniciResponse response = new KullaniciResponse();
        List<Kullanici> kullaniciList = kullaniciRepository.findAll();
        response.setKullaniciList(kullaniciList);
        return response;

    }


}
