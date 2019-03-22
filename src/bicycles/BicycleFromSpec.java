package bicycles;
import bicycles.BicycleBase;

public class BicycleFromSpec extends BicycleBase {
    private final BicycleSpecification anyBicycle;

    public BicycleFromSpec(BicycleSpecification anyBicycle){
        this.anyBicycle = anyBicycle;
    }


    @Override
    public void accelerate() {
        this.changeSpeed(this.anyBicycle.getAccelerationSpeed());
    }

    @Override
    public void brake() {
        this.changeSpeed(this.anyBicycle.getBrakeSpeed());
    }
}
