package com.company;

public class SportsCar extends Car{

    protected String color;
    protected String model;


    protected SportsCar(int currentGear, int maxSpeed, String color, String model) {
        super(maxSpeed,currentGear);
        this.color = color;
        this.model = model;
        System.out.println("Your current gear = " + currentGear + "\n your max speed = " + maxSpeed
        + "\n your car color is " + color + " \n your car mode " + model);

    }
}
