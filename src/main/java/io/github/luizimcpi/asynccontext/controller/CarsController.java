package io.github.luizimcpi.asynccontext.controller;

import io.github.luizimcpi.asynccontext.service.CarsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarsController {

    private final CarsService carsService;

    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @PostMapping("/async")
    public ResponseEntity<Void> callAsync() {
        carsService.processCarsByLanguage();
        return ResponseEntity.ok().build();
    }

    @PostMapping("/sync")
    public ResponseEntity<Void> callSync() {
        carsService.processCarsByLanguageSync();
        return ResponseEntity.ok().build();
    }
}
