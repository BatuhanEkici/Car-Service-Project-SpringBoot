package com.example.car.service;

import com.example.car.model.Cabrio;
import com.example.car.model.Hatchback;
import com.example.car.model.ICar;
import com.example.car.model.Sedan;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    public String getCarType(String carType) {
        if(carType.equalsIgnoreCase("Cabrio")) {
            Cabrio cabrio = new Cabrio();
            return this.getCarType(cabrio);
        }
       else if(carType.equalsIgnoreCase("Sedan")) {
            Sedan sedan = new Sedan();
            return this.getCarType(sedan);
        }
        else if(carType.equalsIgnoreCase("Hatchback")) {
            Hatchback hatchback = new Hatchback();
            return this.getCarType(hatchback);
        }
        return "unexpected car";
    }

    public String getCarType(ICar car) {
        return car.getType();
    }
}
