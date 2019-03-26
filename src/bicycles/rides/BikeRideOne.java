package bicycles.rides;

import bicycles.Bicycle;
import bicycles.rides.BikeRide;

public class BikeRideOne implements BikeRide {
    private final Bicycle bicycle;

    public BikeRideOne(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public void ride(){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    @Override
    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }
}
