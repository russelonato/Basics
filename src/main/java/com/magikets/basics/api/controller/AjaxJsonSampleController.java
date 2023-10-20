package com.magikets.basics.api.controller;

import com.magikets.basics.api.model.Animal;
import com.magikets.basics.api.service.AjaxJsonSampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/ajaxjsonsample")
public class AjaxJsonSampleController {
    private AjaxJsonSampleService service;

    @Autowired
    public AjaxJsonSampleController(AjaxJsonSampleService service){
        this.service = service;
    }

    @GetMapping(path = "pets")
    public List<Animal> getPets(){
        return this.service.getPets();
    }
}
