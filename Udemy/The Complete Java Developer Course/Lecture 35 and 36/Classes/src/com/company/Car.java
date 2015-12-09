package com.company;

/**
 * Created on 12/4/2015.
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public int getDoors() {
        return this.doors;
    }
}
