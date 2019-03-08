package bicycles.models;

import bicycles.Bicycle;

public class RoadBike implements Bicycle {
    protected int speed;

    @Override
    public void accelerate() {
        speed +=11;
    }

    @Override
    public void brake() {
        speed -=4;
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
