package com.proje.yonetim.service;

import com.proje.yonetim.entities.Kullanici;
import com.proje.yonetim.entities.Proje;
import com.proje.yonetim.model.KullaniciRequest;
import com.proje.yonetim.model.KullaniciResponse;
import com.proje.yonetim.model.ProjeResponse;
import com.proje.yonetim.repository.KullaniciRepository;
import com.proje.yonetim.repository.ProjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjeService {

    @Autowired
    private ProjeRepository projeRepository;

    public ProjeResponse getProje() {
        ProjeResponse response = new ProjeResponse();
        List<Proje> projeList = projeRepository.findAll();
        response.setProjeList(projeList);
        return response;

    }


}
