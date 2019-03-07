package bicycles;

public class BikeRide {

//    private final Bicycle bicyle;
    public Bicycle bicycle;

    public BikeRide(Bicycle bicycle) {
           this.bicyle = bicycle;
        }


    public void ride(){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    public int currentSpeed() {
        return this.bicyle.currentSpeed();
    }
}
