package com.proje.yonetim.service;

import com.proje.yonetim.entities.Ders;
import com.proje.yonetim.entities.Proje;
import com.proje.yonetim.model.DersResponse;
import com.proje.yonetim.model.ProjeResponse;
import com.proje.yonetim.repository.DersRepository;
import com.proje.yonetim.repository.ProjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DersService {

    @Autowired
    private DersRepository dersRepository;

    public DersResponse getDers() {
        DersResponse response = new DersResponse();
        List<Ders> dersList = dersRepository.findAll();
        response.setDersList(dersList);
        return response;

    }


}
