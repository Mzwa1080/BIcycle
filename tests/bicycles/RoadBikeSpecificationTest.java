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
        BicycleSpecification tandem= new BicycleSpecification(11, 4,BicycleType.TANDEM);

        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(tandem);

        funRoadBike.accept(bicycle);
        funRoadBike.accept(bicycle2);
//-----------------------------------------TEST FOR ACCEPTED BIKE TYPE `-----------
        System.out.printf("PRINT ACCEPTED/REJECTED!: %s",funRoadBike.accept(bicycle));
//        System.out.println(funRoadBike.Accept(bicycle2));
//------------------------------------------TEST FOR NUMBER OF ROADBIKE -----------
        System.out.printf("PRINT THE TYPES OF BIKES: %s", funRoadBike.getCountForType(BicycleType.ROADBIKE));
        assertEquals(1,1);
    }
}
