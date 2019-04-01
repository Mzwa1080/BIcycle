package bicycles.rides.funride;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.FunRide;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideForMountainBike {
    @Test
    public void AcceptMountainBikes(){
        FunRide mountainBike = new FunRide(9);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MOUNTAINBIKE);
        Bicycle mountainBicycle = new BicycleFromSpec(mountainBikeSpec);
        assertEquals("Accepted!", mountainBike.accept(mountainBicycle));
    }

    @Test
    public void HowManyMountainBikeTypes(){
        FunRide mountainBike = new FunRide(10);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MOUNTAINBIKE);
        Bicycle mountainBicycle = new BicycleFromSpec(mountainBikeSpec);
        Bicycle mountainBicycle2 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle mountainBicycle3 = new BicycleFromSpec(mountainBikeSpec);

        BicycleSpecification RoadBikeBicycle  = new BicycleSpecification(11,-4,BicycleType.ROADBIKE);
        Bicycle roadBike = new BicycleFromSpec(RoadBikeBicycle);

        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle2);
        mountainBike.accept(mountainBicycle3);
        mountainBike.accept(roadBike);

        assertEquals(3, mountainBike.getCountForType(BicycleType.MOUNTAINBIKE));
    }


    @Test
    public void HowManyBikesEntered(){
        FunRide mountainBike = new FunRide(19);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MOUNTAINBIKE);
        Bicycle mountainBicycle = new BicycleFromSpec(mountainBikeSpec);
        Bicycle mountainBicycle2 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle mountainBicycle3 = new BicycleFromSpec(mountainBikeSpec);

        BicycleSpecification RoadBikeBicycle  = new BicycleSpecification(11,-4,BicycleType.ROADBIKE);
        Bicycle roadBike = new BicycleFromSpec(RoadBikeBicycle);
        Bicycle roadBike2 = new BicycleFromSpec(RoadBikeBicycle);

        mountainBike.accept(mountainBicycle);
        mountainBike.accept(mountainBicycle2);
        mountainBike.accept(roadBike);
        mountainBike.accept(roadBike2);


        assertEquals(4, mountainBike.getEnteredCount());
    }
}

