package bicycles.rides;

import bicycles.Bicycle;
import bicycles.rides.BikeRide;

public class BikeRideThree implements BikeRide {
    private final Bicycle bicycle;

    public BikeRideThree(Bicycle bicycle){
        this.bicycle = bicycle;
    }

    @Override
    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }

    public void ride(){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();

    }
}
