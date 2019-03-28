package bicycles;

import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideTwo;
import bicycles.rides.BikeRideThree;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideForMountainBike {
    @Test
    public void MountainBikeRideOne(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MOUNTAINBIKE);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRideOne mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride();// MountainBike

//        System.out.println(mBikeRide.currentSpeed());

        assertEquals(14,mBikeRide.currentSpeed());
    }


    @Test
    public void MountainBikeRideTwo(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MOUNTAINBIKE);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRideTwo mBikeRide = new BikeRideTwo(mountainBike);
        mBikeRide.ride();// MountainBike

//        System.out.println(mBikeRide.currentSpeed());

        assertEquals(31,mBikeRide.currentSpeed());
    }

    @Test
    public void MountainBikeRideThree(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MOUNTAINBIKE);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRideThree mBikeRide = new BikeRideThree(mountainBike);
        mBikeRide.ride();// MountainBike

//        System.out.println(mBikeRide.currentSpeed());

        assertEquals(16,mBikeRide.currentSpeed());
    }


}
