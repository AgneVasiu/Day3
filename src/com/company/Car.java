package com.company;

public class Car extends Vehicle {

    protected String destination;
    protected int currentGear;

    protected Car(int currentSpeed, int currentGear) {
        super(currentSpeed);
        this.currentGear = currentGear;

    }
    protected  void setCurrentGear(int speedAmount){
        if (speedAmount < 10) {
            currentGear = 1;
            System.out.println("With this speed your gear will be " + currentGear);
        }
        if (speedAmount == 20) {
            currentGear = 2;
            System.out.println("With this speed your gear will be " + currentGear);
        }
        if (speedAmount == 30) {
            currentGear = 3;
            System.out.println("With this speed your gear will be " + currentGear);
        }
        if (speedAmount == 40) {
            currentGear = 4;
            System.out.println("With this speed your gear will be " + currentGear);
        }
        if (speedAmount >= 50) {
            currentGear = 5;
            System.out.println("With this speed your gear will be " + currentGear);
        }

    }
     protected void getCurrentGear(){
         System.out.println("Your current gear is " + currentGear);
     }

    protected void setDestination(String destination){
        this.destination = destination;
        System.out.println("You set your destination to  " + destination);
    }
    protected void getDestination(){

        System.out.println("Your destination is " +  destination);
    }


}

