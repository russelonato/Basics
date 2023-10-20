package com.magikets.basics.api.service;

import com.magikets.basics.api.model.BasicModel;
import org.springframework.stereotype.Service;

/**
 * @author Russel
 */
@Service
public class BasicService {

    public BasicModel getBasicModel(){
        return BasicModel.builder().attributeA("A").attributeB("B").attributeC("C").build();
    }
}
