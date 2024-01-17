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
    @Test
    public void testSeeingCapacityOfBattery(){
        Car car = new Car("Blue", new Battery("rechargeable"), new CarRemote("simple"));
        car.moveForward(100);
        Assertions.assertTrue(car.remainingCapacity() == 90);


    }

    /*Test use case 5*/
    @Test
    public void testMovingCarForward(){
        Car car = new Car("Blue", new Battery("rechargeable"), new CarRemote("simple"));
        Assertions.assertTrue(car.moveForward(100));

    }
    @Test
    public void testMovingCarBackwards(){
        Car car = new Car("Blue", new Battery("rechargeable"), new CarRemote("simple"));
        Assertions.assertTrue(car.moveBackwards(100));
    }

    /*Test use case 6*/
    @Test
    public void testStoppingCarIfMoving(){
        Car car = new Car("Blue", new Battery("rechargeable"), new CarRemote("simple"));
        car.moveForward(100);
        Assertions.assertTrue(car.stopCar());
    }

    @Test
    public void testStoppingCarIfNotMoving(){
        Car car = new Car("Blue", new Battery("rechargeable"), new CarRemote("simple"));
        Assertions.assertTrue(car.stopCar());
    }
}
