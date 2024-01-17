package com.booleanuk.core;

import java.util.Objects;

public class Car {


    private String color;
    private Battery battery;
    private CarRemote carRemote;

    public Car(String color){
        this.color = color;
    }
    public Car(String color, Battery battery){
        this.color = color;
        this.battery = battery;
    }
    public Car(String color, Battery battery, CarRemote carRemote){
        this.color = color;
        this.battery = battery;
        this.carRemote = carRemote;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    public boolean replaceBattery(Battery battery){
        if(Objects.equals(battery.getType(), this.battery.getType())){
            return false;
        }
        else{
            this.battery = battery;
            return true;
        }
    }
    public boolean switchRemote(CarRemote carRemote){
        if(Objects.equals(carRemote.getType(), this.carRemote.getType())){
            return false;
        }
        else{
            this.carRemote = carRemote;
            return true;
        }
    }
    public int remainingCapacity(){
        return this.battery.getCapacity();
    }

    public boolean moveForward(int i){
        i = i /10;
        if(i > battery.getCapacity()){
            return false;
        }
        else{
            battery.drainCapacity(i);
            return true;
        }
    }
    public boolean moveBackwards(int i){
        i = i /10;
        if(i > battery.getCapacity()){
            return false;
        }
        else{
            battery.drainCapacity(i);
            return true;
        }
    }
}
