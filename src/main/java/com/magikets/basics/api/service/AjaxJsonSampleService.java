package com.magikets.basics.api.service;

import com.magikets.basics.api.model.Animal;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author Russel
 */
@Service
public class AjaxJsonSampleService {

    public List<Animal> getPets() {
        return List.of(
                Animal.builder()
                        .name("Meowsy")
                        .species("cat")
                        .foods(Map.of("likes", List.of("tuna", "catnip"), "dislikes", List.of("ham", "zucchini")))
                        .build(),
                Animal.builder()
                        .name("Barky")
                        .species("dog")
                        .foods(Map.of("likes", List.of("bones", "carrots"), "dislikes", List.of("tuna")))
                        .build(),
                Animal.builder()
                        .name("Purrpaws")
                        .species("cat")
                        .foods(Map.of("likes", List.of("mice"), "dislikes", List.of("cookies")))
                        .build());
    }
}
