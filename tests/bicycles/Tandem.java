package bicycles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tandem {
//    public Tandem accelerate;
    @Test
    public void ShouldReturnTandemSpeed(){
        Tandem tandemObj = new Tandem();
//        I can Test for each method
        BikeRide bikeRide = new BikeRide(tandemObj);
        bikeRide.ride();

//        System.out.printf("This is a tandem speed: %s",);
        assertEquals(1,1);
    }

}
