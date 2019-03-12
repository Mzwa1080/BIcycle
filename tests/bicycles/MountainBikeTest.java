package bicycles;

import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {


    @Test
    public void shouldReturnSpeedForMountainBike(){
        MountainBike mBIke = new MountainBike();
        BikeRide bikeRide = new BikeRide(mBIke);
        bikeRide.ride();

//        System.out.printf("this is a value for MountainBike: " + bikeRide.currentSpeed());

//        assertEquals(1,1);
        assertEquals(bikeRide.currentSpeed(), 14);
    }
}
