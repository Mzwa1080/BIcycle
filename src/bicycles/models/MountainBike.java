package bicycles.models;

import bicycles.Bicycle;

public class MountainBike implements Bicycle {
    protected int speed;


    @Override
    public void accelerate() {
        speed +=5;
    }

    @Override
    public void brake() {
        speed -=3;
    }

    @Override
    public int currentSpeed() {
        return speed;
    }

    @Override
    public void stop() {
        speed = 0;
    }
}
