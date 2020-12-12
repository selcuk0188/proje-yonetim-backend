package com.proje.yonetim.service;

import com.proje.yonetim.entities.ProjeOnay;
import com.proje.yonetim.model.ProjeOnayGuncelleResponse;
import com.proje.yonetim.model.ProjeOnayResponse;
import com.proje.yonetim.repository.ProjeOnayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjeOnayService {

    @Autowired
    private ProjeOnayRepository projeOnayRepository;

    public ProjeOnayResponse getProjeOnay() {
        ProjeOnayResponse response = new ProjeOnayResponse();
        List<ProjeOnay> projeOnayList = projeOnayRepository.findAll();
        response.setProjeOnayList(projeOnayList);
        return response;
    }

    public ProjeOnayGuncelleResponse updateProjeOnay(ProjeOnay projeOnay) {
        ProjeOnayGuncelleResponse response = new ProjeOnayGuncelleResponse();
        if (projeOnay.getProjeId() != null) {
            ProjeOnay projeOnay_ = projeOnayRepository.findByProjeId(projeOnay.getProjeId());
            projeOnay_.setDurum(projeOnay.getDurum());
            projeOnayRepository.save(projeOnay_);
        }
        response.setBasaraliMi(true);
        return response;
    }


}
