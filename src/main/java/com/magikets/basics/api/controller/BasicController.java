package com.magikets.basics.api.controller;

import com.magikets.basics.api.model.BasicModel;
import com.magikets.basics.api.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Russel
 */
@RestController
@RequestMapping(path = "api/v1/basic")
public class BasicController {

    private BasicService service;

    @Autowired
    public BasicController(BasicService service){
        this.service = service;
    }

    @GetMapping
    public BasicModel getBasicModel(){
        return service.getBasicModel();
    }
}
