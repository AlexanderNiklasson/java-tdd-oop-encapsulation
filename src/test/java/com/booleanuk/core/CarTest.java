package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.rmi.Remote;

public class CarTest {

    /* Test use case 1 */
    @Test
    public void testSettingColorOfCarCorrectly(){
        String color = "Blue";
        Car car = new Car(color);
        Assertions.assertEquals(color, car.getColor());
    }

    /*Test use case 2 & 8*/
    @Test
    public void testChangingBetweenBatteriesSuccess(){
        Car car = new Car("Blue", new Battery("rechargeable"));
        Assertions.assertTrue(car.replaceBattery(new Battery("disposable")));

    }

    /*Test use case 3*/
    @Test
    public void testSwitchingRemotes(){
        Car car = new Car("Blue", new Battery("rechargeable"), new CarRemote("simple"));
        Assertions.assertTrue(car.switchRemote(new CarRemote("advanced")));
    }

    /*Test use case 4*/
}
