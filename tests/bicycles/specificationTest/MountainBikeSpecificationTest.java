package bicycles.specificationTest;


import bicycles.BicycleType;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeSpecificationTest {

    @Test
    public void MountainBikeAccelerationSpecification(){
        BicycleSpecification mountainBikeAccelerationSpecification = new BicycleSpecification(5, -3, BicycleType.MOUNTAINBIKE);
        assertEquals(mountainBikeAccelerationSpecification.getAccelerationSpeed(), 5);
    }

    @Test
    public void MountainBikeBrakeSpecification(){
        BicycleSpecification mountainBikeBrakeSpec = new BicycleSpecification(5, -3,BicycleType.MOUNTAINBIKE);
        assertEquals(mountainBikeBrakeSpec.getBrakeSpeed(), -3);
    }

}
