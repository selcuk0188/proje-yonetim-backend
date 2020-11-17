package com.proje.yonetim.controller;


import com.proje.yonetim.model.ProjeResponse;
import com.proje.yonetim.service.ProjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjeController {

    @Autowired
    private ProjeService projeService;

    @RequestMapping(value = "/proje", method = RequestMethod.POST)
    public ProjeResponse getproje() {
        ProjeResponse response = new ProjeResponse();
        ProjeResponse projeResponse = projeService.getProje();
        response.setProjeList(projeResponse.getProjeList());
        return response;
    }
}
