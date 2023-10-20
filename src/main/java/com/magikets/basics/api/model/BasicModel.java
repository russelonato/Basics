package com.magikets.basics.api.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Russel
 */
@Setter
@Getter
@Builder
public class BasicModel {
    private String attributeA;
    private String attributeB;
    private String attributeC;
}
