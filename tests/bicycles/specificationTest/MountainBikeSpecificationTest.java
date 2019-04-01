package bicycles.specificationTest;


import bicycles.BicycleType;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeSpecificationTest {

    @Test
    public void MountainBikeAccelerationSpecification(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MOUNTAINBIKE);
        assertEquals(mountainBikeSpec.getAccelerationSpeed(), 5);
    }

    @Test
    public void MountainBikeBRAKESpecification(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3,BicycleType.MOUNTAINBIKE);
        assertEquals(mountainBikeSpec.getBrakeSpeed(), -3);
    }

}
