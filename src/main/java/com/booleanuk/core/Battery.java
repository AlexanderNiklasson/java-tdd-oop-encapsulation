package com.booleanuk.core;

public class Battery {
    private final String type;
    private int capacity;
    public Battery(String type){
        this.type = type;
        this.capacity = 100;
    }
    public String getType(){
        return this.type;
    }
    public int drainCapacity(int c){
        this.capacity -= c;
        return this.capacity;
    }
    public int getCapacity(){
        return this.capacity;
    }
}
