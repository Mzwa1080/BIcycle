package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideForRoadBike {
    @Test
    public void RoadBikeOne(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.ROADBIKE);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRide =  new BikeRideOne(bicycle);
        bikeRide.ride();
        assertEquals(bikeRide.currentSpeed(),36);
    }

    @Test
    public void RoadBikeTwo(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4,BicycleType.ROADBIKE);
        Bicycle bicycles = new BicycleFromSpec(roadBikeSpec);
        BikeRideTwo bikeRide =  new BikeRideTwo(bicycles);
        bikeRide.ride();
        assertEquals(bikeRide.currentSpeed(),76);
    }

    @Test
    public void RoadBikeThree(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4,BicycleType.ROADBIKE);
        Bicycle bicycless = new BicycleFromSpec(roadBikeSpec);
        BikeRideThree bikeRide =  new BikeRideThree(bicycless);
        bikeRide.ride();
        assertEquals(bikeRide.currentSpeed(),43);
    }
}
