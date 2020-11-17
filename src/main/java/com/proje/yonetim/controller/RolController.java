package com.proje.yonetim.controller;


import com.proje.yonetim.model.ProjeResponse;
import com.proje.yonetim.model.RolResponse;
import com.proje.yonetim.service.ProjeService;
import com.proje.yonetim.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RolController {

    @Autowired
    private RolService rolService;

    @RequestMapping(value = "/rol", method = RequestMethod.POST)
    public RolResponse getrol() {
        RolResponse response = new RolResponse();
        RolResponse rolResponse = rolService.getrol();
        response.setRolList(rolResponse.getRolList());
        return response;
    }
}
