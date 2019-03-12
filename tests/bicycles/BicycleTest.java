package bicycles;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
//---ROADBIKE 1 ---------
    @Test
    public void shouldReturnSpeedForRoadBike(){
        RoadBike roadbikee = new RoadBike();
        BikeRideOne bikeRide = new BikeRideOne(roadbikee);
        bikeRide.ride();
        System.out.printf("This is RoadBike Value: %s", bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(), 36);
    }

//----ROADBIKE TWO ------------
    @Test
    public void shouldReturnSecondSpeedForRoadBike(){
        RoadBike roadbike2 = new RoadBike();
        BikeRideTwo bikeRide = new BikeRideTwo(roadbike2);
        bikeRide.ride();
        System.out.printf("This is RoadBikeTwo Value: %s", bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(), 76);
    }
//--------ROADBIke THREE ------------
    @Test
    public void shouldReturnThirdSpeedForRoadBike(){
        RoadBike roadbikeThree = new RoadBike();
        BikeRideThree bikeRide = new BikeRideThree(roadbikeThree);
        bikeRide.ride();
        System.out.printf("This is RoadbikeThree Value: %s", bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(), 43);
    }

}
