package bicycles;

import bicycles.rides.BikeRideOne;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
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

//        System.out.println(mBikeRide.currentSpeed());

        assertEquals(14,mBikeRide.currentSpeed());
    }

    @Test
    public void ACCEPTMOUNTAINBIKES(){
        FunRide mountainBike = new FunRide(9);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MOUNTAINBIKE);
        Bicycle mountainBicycle = new BicycleFromSpec(mountainBikeSpec);

        BicycleSpecification RoadBikeBicycle  = new BicycleSpecification(11,-4,BicycleType.ROADBIKE);
        Bicycle roadBike = new BicycleFromSpec(RoadBikeBicycle);

        BicycleSpecification tandem  = new BicycleSpecification(11,-4,BicycleType.ROADBIKE);
        Bicycle tandemBike = new BicycleFromSpec(tandem);

        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(roadBike);
        mountainBike.accept(tandemBike);
        mountainBike.accept(tandemBike);


        assertEquals("Accepted!", mountainBike.accept(mountainBicycle));
    }

    @Test
    public void HowManyMountainBikeTypes(){
        FunRide mountainBike = new FunRide(10);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MOUNTAINBIKE);
        Bicycle mountainBicycle = new BicycleFromSpec(mountainBikeSpec);

        BicycleSpecification RoadBikeBicycle  = new BicycleSpecification(11,-4,BicycleType.ROADBIKE);
        Bicycle roadBike = new BicycleFromSpec(RoadBikeBicycle);

        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(roadBike);

        assertEquals(10, mountainBike.getCountForType(BicycleType.MOUNTAINBIKE));
    }


    @Test
    public void HowManyBikesEntered(){
        FunRide mountainBike = new FunRide(19);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MOUNTAINBIKE);
        Bicycle mountainBicycle = new BicycleFromSpec(mountainBikeSpec);

        BicycleSpecification RoadBikeBicycle  = new BicycleSpecification(11,-4,BicycleType.ROADBIKE);
        Bicycle roadBike = new BicycleFromSpec(RoadBikeBicycle);

        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle);
        mountainBike.accept(roadBike);

        assertEquals(11, mountainBike.getEnteredCount());
    }

}
