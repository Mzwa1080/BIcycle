package bicycles;

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

