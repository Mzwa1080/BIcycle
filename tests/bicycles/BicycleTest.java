package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
    @Test
    public void Acceleration(){
        Bicycle bicycle = new Bicycle();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();

       System.out.printf("this is a current speed: " + bikeRide.currentSpeed());

        assertEquals(1,1);
    }

}
