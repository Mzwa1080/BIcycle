package bicycles.specificationTest;

import bicycles.BicycleType;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemSpecificationTest {
    @Test
    public void TandemBikeAccelerationSpecification(){
        BicycleSpecification tandemBikeAccelerationSpec = new BicycleSpecification(12, -7, BicycleType.TANDEM);
        assertEquals(tandemBikeAccelerationSpec.getAccelerationSpeed(), 12);
    }

    @Test
    public void TandemBIkeBrakeSpecification(){
        BicycleSpecification tandemBikeBrakeSpecification = new BicycleSpecification(12,-7, BicycleType.TANDEM);
        assertEquals(tandemBikeBrakeSpecification.getBrakeSpeed(), -7);
    }
}
