package bicycles.specification;
import bicycles.BicycleBase;
import bicycles.BicycleType;

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

    @Override
    public BicycleType getBicycleType() {
        return this.getBicycleType(this.anyBicycle.getBicycleType());
    }




}
