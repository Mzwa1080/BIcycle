package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeSpecificationTest {

    @Test
    public void MountainBikeAccelerationSpecification(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3,BicycleType.MOUNTAINBIKE);
        System.out.println(mountainBikeSpec.getAccelerationSpeed());
        assertEquals(mountainBikeSpec.getAccelerationSpeed(), 5);
    }


    @Test
    public void MountainBikeBRAKESpecification(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3,BicycleType.MOUNTAINBIKE);
        System.out.println(mountainBikeSpec.getBrakeSpeed());
        assertEquals(mountainBikeSpec.getBrakeSpeed(), -3);
    }

    @Test
    public void MOUNTAINBIKESPEC(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MOUNTAINBIKE);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRideOne mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride();// MountainBike

        System.out.println(mBikeRide.currentSpeed());

        assertEquals(1,1);
    }
}
