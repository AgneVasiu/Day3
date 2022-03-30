package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void Task1() {
        int[][] arrayTable = new int[10][10];
        int result;
        for (int i = 1; i <= arrayTable.length; i++) {

            for (int j = 1; j <= arrayTable.length; j++) {
                result = i * j;
                System.out.println(i + " * " + j + " = " + result);

            }
            System.out.println("\n");

        }
    }
    public static void Task2(){
        int[] randArray = new int[4];
        Random random = new Random();
        for(int i=0; i < 4; i++){
            int randWholeNumber = random.nextInt(101);
            randArray[i] = randWholeNumber;
        }
        for (int b = 0;b < randArray.length; b++) {
            System.out.print(randArray[b] + " \n");
        }
    }
    public  static  void Task3and4(){
        BankAccount person = new BankAccount();
        person.deposit(5000.12);
        BankAccount Person = new BankAccount();
        Person.deposit(2000.0);
        person.transfer(125.00, Person);
        Person.withdraw(50.0);
        Person.withdraw(3000);
        System.out.println(Person.printBalance());
        Person.transfer(3000.0, person);
        person.deposit(2000);
        person.transfer(125.00, Person);
    }

    public static void Task5(){
        Vehicle car = new Vehicle(250);
        SportsCar mazda = new SportsCar(1,250,"Red","Mazda MX-5");
        mazda.increaseSpeed(20);
        mazda.setCurrentGear(20);
        mazda.getCurrentGear();
        mazda.currentDirection(0);
        mazda.setDestination("Kaunas");
        mazda.getDestination();
        mazda.increaseSpeed(100);
        mazda.setCurrentGear(120);
        mazda.getCurrentGear();
        mazda.slowDown(70);

    }




    public static void main(String[] args) {
        Task1();
        Task2();
        Task3and4();
        Task5();


    }
}
