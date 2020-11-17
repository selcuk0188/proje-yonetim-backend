package com.proje.yonetim.service;

import com.proje.yonetim.entities.Ders;
import com.proje.yonetim.entities.ProjeOnay;
import com.proje.yonetim.model.DersResponse;
import com.proje.yonetim.model.ProjeOnayResponse;
import com.proje.yonetim.model.ProjeResponse;
import com.proje.yonetim.repository.DersRepository;
import com.proje.yonetim.repository.ProjeOnayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjeOnayService {

    @Autowired
    private ProjeOnayRepository projeOnayRepository;

    public ProjeOnayResponse getprojeonay() {
        ProjeOnayResponse response = new ProjeOnayResponse();
        List<ProjeOnay> projeOnayList = projeOnayRepository.findAll();
        response.setProjeOnayList(projeOnayList);
        return response;

    }


}
