import bicycles.BikeRide;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemTest {
    @Test
    public void shouldReturnSpeedOfTandem(){
        Tandem tandemObj = new Tandem();
        BikeRide bikeRide = new BikeRide(tandemObj);
        bikeRide.ride();

//        System.out.println(bikeRide.currentSpeed());
        assertEquals(34,bikeRide.currentSpeed());
    }


}
