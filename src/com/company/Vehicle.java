package com.company;

public class Vehicle {
    private int currentSpeed;
    private int maxSpeed;
    private int directionNow = 0;
    private final int minSpead = 0;


    public Vehicle(int maxSpeed) {
        this.currentSpeed = minSpead;
        this.maxSpeed = maxSpeed;
    }
    protected void increaseSpeed(int amount) {
        if (amount >= 0) {
            if (currentSpeed + amount < maxSpeed) {
                currentSpeed += amount;
                System.out.println(" Your speed now is " + currentSpeed);
            } else {
                currentSpeed = maxSpeed;
                System.out.println("Your speed now is " + currentSpeed);
            }
        }else{
            System.out.println(" You have entered wrong value.");
        }

    }
    protected void slowDown(int amount) {
        if (amount >= 0) {
            if (currentSpeed - amount > 0) {
                currentSpeed -= amount;
                System.out.println("Your speed decreased to  " + currentSpeed);
            } else {
                currentSpeed = 0;
                System.out.println("Your speed decreased to " + currentSpeed + " you are now standing still in one place " );
            }
        }else{
            System.out.println(" You have entered wrong value.");
        }

    }

    protected void currentDirection(int direction){
        if(direction == 0){
            directionNow = 0;
            System.out.println("You are driving strait");
        } else if(direction > 0){
            directionNow = 1;
            System.out.println("You are moving to the right");
        }else{
            directionNow = -1;
            System.out.println("you are moving to the left");
        }


    }

}
