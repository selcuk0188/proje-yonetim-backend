package com.proje.yonetim.service;

import com.proje.yonetim.entities.Proje;
import com.proje.yonetim.model.ProjeKayitResponse;
import com.proje.yonetim.model.ProjeListResponse;
import com.proje.yonetim.repository.ProjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjeService {

    @Autowired
    private ProjeRepository projeRepository;

    public ProjeListResponse getProjeList() {
        ProjeListResponse response = new ProjeListResponse();
        List<Proje> projeList = projeRepository.findAll();
        response.setProjeList(projeList);
        return response;

    }

    public ProjeListResponse getProjeBykullaniciId(Integer kullaniciId) {
        ProjeListResponse response = new ProjeListResponse();
        List<Proje> projeList = projeRepository.findBykullaniciId(kullaniciId);
        response.setProjeList(projeList);
        return response;

    }

    public ProjeKayitResponse saveProje(Proje proje) {
        ProjeKayitResponse response = new ProjeKayitResponse();
        projeRepository.save(proje);
        response.setBasariliMi(true);
        return response;
    }

    public ProjeKayitResponse assignProje(Integer projeId, Integer kullaniciId) {
        ProjeKayitResponse response = new ProjeKayitResponse();
        Optional<Proje> proje = projeRepository.findById(projeId);
        if (proje.isPresent()) {
            proje.get().setkullaniciId(kullaniciId);
            projeRepository.save(proje.get());
        }
        response.setBasariliMi(true);
        return response;

    }


}
