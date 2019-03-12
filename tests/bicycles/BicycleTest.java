package bicycles;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
    @Test
    public void shouldReturnSpeedForRoadBike(){
        RoadBike roadbikee = new RoadBike();
        BikeRide bikeRide = new BikeRide(roadbikee);
        bikeRide.ride();
        System.out.printf("This is RoadBike Value: %s", bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(), 36);
    }


}
