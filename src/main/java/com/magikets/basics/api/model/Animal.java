package com.magikets.basics.api.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Russel
 */
@Setter
@Getter
@Builder
public class Animal {

    private String name;

    private String species;

    private Map<String, List<String>> foods;
}
