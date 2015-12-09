package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("911");
        porsche.setDoors(10);
        System.out.println("Model is " + porsche.getModel());
        //System.out.println("Doors is " + porsche.getDoors());
    }
}
