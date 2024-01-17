package com.booleanuk.core;

public class Car {


    private String color;
    private Battery battery;
    public Car(){

    }
    public Car(String color){
        this.color = color;
    }
    public Car(String color, Battery battery){
        this.color = color;
        this.battery = battery;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    public boolean replaceBattery(Battery battery){
        if(battery.getType() == this.battery.getType()){
            return false;
        }
        else{
            this.battery = battery;
            return true;
        }


    }
}
