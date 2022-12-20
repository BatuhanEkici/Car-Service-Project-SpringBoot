package com.example.car.service;

import com.example.car.model.Cabrio;
import com.example.car.model.Hatchback;
import com.example.car.model.ICar;
import com.example.car.model.Sedan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    @Test
    void testGetCarTypeCabrio() {
        ICar car = new Cabrio();
        String carType =car.getType();
        assertEquals(carType,"Cabrio Car has produced.");
    }

    @Test
    void testGetCarTypeSedan() {
        ICar car = new Sedan();
        String carType =car.getType();
        assertEquals(carType,"Sedan Car has produced.");
    }

    @Test
    void testGetCarTypeHatchback() {
        ICar car = new Hatchback();
        String carType =car.getType();
        assertEquals(carType,"Hatchback Car has produced.");
    }

    @Test
    void testGetCarTypeHatchbackFail() {
        ICar car = new Sedan();
        String carType =car.getType();
        assertEquals(carType,"Hatchback Car has produced.");
    }



}