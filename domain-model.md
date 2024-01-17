## Domain model

```
1. I want to be able to decide on the colour of the car.
```

| Classes | Methods                     | Scenario               | Returns                    |
|---------|-----------------------------|------------------------|----------------------------|
| Car     | void setColor(String color) |                        |                            |
|         | String getColor()           | Set color and fetch it | Same string as in getColor |


```
2. I want to be able to choose between rechargable and disposable batteries.
8. I want to be able to replace the battery with either kind as needed.
```

| Classes           | Methods                                 | Scenario             | Returns |
|-------------------|-----------------------------------------|----------------------|---------|
| Car  <br/>Battery | boolean replaceBattery(Battery battery) | new type of battery  | true    |
|                   |                                         | same type of battery | false   |

```
3. I want to choose between a simple and an advanced remote control.
```

| Classes | Methods                             | Scenario                         | Returns |
|---------|-------------------------------------|----------------------------------|---------|
| Car     | boolean switchRemote(Remote remote) | not same type as existing remote | true    |
|         |                                     | same type as existing remote     | false   |

```
4. I want to be able to see the battery percentage remaining.
```

| Classes           | Methods                                         | Scenario    | Returns                     |
|-------------------|-------------------------------------------------|-------------|-----------------------------|
| Car <br/>Battery  | int getCapacity() <br/>int remainingCapacity()  | Call method | int with remaining capacity |
|                   |                                                 |             |                             |

```
5. I want to be able to move the car forward and backward a specific distance.
```

| Classes | Methods                             | Scenario                                 | Returns         |
|---------|-------------------------------------|------------------------------------------|-----------------|
| Car     | boolean moveForward(int distance)   | use viable int<br/>use a not viable int  | true<br/>false  |
|         | boolean moveBackwards(int distance) | use viable int<br/>use a not viable int  | true<br/>false  |

```
6. I want to be able to stop the car from moving.
```

| Classes | Methods           | Scenario                  | Returns |
|---------|-------------------|---------------------------|---------|
| Car     | boolean stopCar() | If car is moving          | true    |
|         |                   | If car is already stopped | false   |


```
7. I want to be able to turn the car left and right.
```

| Classes | Methods          | Scenario    | Returns |
|---------|------------------|-------------|---------|
| Car     | void turnLeft()  | Call method | void    |
|         | void turnRight() | Call method | void    |



