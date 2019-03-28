package bicycles.bikeSpecification;


import bicycles.BicycleType;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeSpecificationTest {

    @Test
    public void MountainBikeAccelerationSpecification(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MOUNTAINBIKE);
        System.out.println(mountainBikeSpec.getAccelerationSpeed());
        assertEquals(mountainBikeSpec.getAccelerationSpeed(), 5);
    }


    @Test
    public void MountainBikeBRAKESpecification(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3,BicycleType.MOUNTAINBIKE);
        System.out.println(mountainBikeSpec.getBrakeSpeed());
        assertEquals(mountainBikeSpec.getBrakeSpeed(), -3);
    }



}
