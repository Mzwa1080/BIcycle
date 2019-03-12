package bicycles;

public class BikeRideTwo implements BikeRide{
    private final Bicycle bicycle;

//----- This BIKE-RIDE-TWO is Taking Any Bike For A Ride() ----

    public BikeRideTwo(Bicycle bicycle){
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
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
    }
}
