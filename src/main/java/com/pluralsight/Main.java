package com.pluralsight;


public class Main {
    public static void main(String[] args) {

        Moped slowRide = new Moped("Tesla", "Blue",200,250);
        slowRide.startEngine();
        slowRide.accelerate();
        System.out.println("The slowRide speed is: " + slowRide.getTopSpeed());
        System.out.println("Also the color is: " + slowRide.getColor());
        System.out.println("It's carries: " + slowRide.getMaxWeight() + " amount of weight!!");
        System.out.println("Lets slow down!");
        slowRide.brake();
        slowRide.stopEngine();





    }


}