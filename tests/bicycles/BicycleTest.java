package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
    @Test
    public void shouldReturnSpeedForMountainBike(){
        MountainBike mBIke = new MountainBike();
        BikeRide bikeRide = new BikeRide(mBIke);
        bikeRide.ride();

       System.out.printf("this is a current speed: " + bikeRide.currentSpeed());

//        assertEquals(1,1);
        assertEquals(bikeRide.currentSpeed(), 14);
    }

    @Test
    public void shouldReturnSpeedForRoadBike(){
//        RoadBike roadBike = new RoadBike();
        RoadBike rBike = new RoadBike();
        BikeRide bikeRide = new BikeRide(rBike);
        bikeRide.ride();

        System.out.printf("this is a current speed: " + bikeRide.currentSpeed());

//        assertEquals(1,1);
        assertEquals(bikeRide.currentSpeed(), 36);
    }
}
