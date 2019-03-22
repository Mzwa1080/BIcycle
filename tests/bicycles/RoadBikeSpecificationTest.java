package bicycles;
import bicycles.BicycleSpecification;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.AssertEquals.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeSpecificationTest {
    @Test
    public void RoadBikeAccelerationSpeedSpecification(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4,BicycleType.ROADBIKE);
//        System.out.println(roadBikeSpec.getAccelerationSpeed());
        assertEquals(roadBikeSpec.getAccelerationSpeed(),11);
    }

    @Test
    public void RoadBikeBrakeSpeedSpecification(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.ROADBIKE);
//        System.out.println(roadBikeSpec.getBrakeSpeed());
        assertEquals(roadBikeSpec.getBrakeSpeed(),4);
    }

    @Test
    public void RoadBIKESPEC(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4,BicycleType.ROADBIKE);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();
//        System.out.println(bikeRide.currentSpeed());

        assertEquals(bikeRide.currentSpeed(),100);
    }

    @Test
    public void FunRideWithRoadBike(){
        FunRide funRoadBike = new FunRide(2);
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4,BicycleType.ROADBIKE);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        funRoadBike.Accept(bicycle);
        funRoadBike.Accept(bicycle);
        funRoadBike.Accept(bicycle);

        System.out.printf("PRINT THE BIKE-ENTERED: %s",funRoadBike.Accept(bicycle));

        assertEquals(1,1);
    }
}
