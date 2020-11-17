package com.proje.yonetim.controller;


import com.proje.yonetim.model.DersResponse;
import com.proje.yonetim.model.ProjeResponse;
import com.proje.yonetim.service.DersService;
import com.proje.yonetim.service.ProjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DersController {

    @Autowired
    private DersService dersService;

    @RequestMapping(value = "/ders", method = RequestMethod.POST)
    public DersResponse getders( ) {
        DersResponse response = new DersResponse();
        DersResponse dersResponse = dersService.getDers();
        response.setDersList(dersResponse.getDersList());
        return response;
    }
}
