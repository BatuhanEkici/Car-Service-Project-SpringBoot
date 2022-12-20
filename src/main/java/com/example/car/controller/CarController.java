package com.example.car.controller;

import com.example.car.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/{carType}")
    public ResponseEntity<String> getCarType(@PathVariable String carType) {
        return ResponseEntity.ok(carService.getCarType(carType));
    }
}
