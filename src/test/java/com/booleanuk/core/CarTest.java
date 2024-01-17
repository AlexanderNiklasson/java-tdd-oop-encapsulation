package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    /* Test use case 1 */
    @Test
    public void testSettingColorOfCarCorrectly(){
        Car car = new Car();
        Assertions.assertTrue(car.setColor("Blue"));
    }
}
