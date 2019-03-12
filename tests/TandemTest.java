import bicycles.BikeRideOne;
import bicycles.BikeRideTwo;
import bicycles.BikeRideThree;

import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemTest {
    @Test
    public void shouldReturnSpeedOfTandem(){
        Tandem tandemObj = new Tandem();
        BikeRideOne bikeRide = new BikeRideOne(tandemObj);
        bikeRide.ride();

//        System.out.println(bikeRide.currentSpeed());
        assertEquals(34,bikeRide.currentSpeed());
    }
//It cannot test the void method

//--------SECOND BIKE RIDE FOR TANDEM ---------
    @Test
    public void shouldSecondSpeedOfTandem(){
        Tandem tandemRideTwo = new Tandem();
        BikeRideTwo bikeRide = new BikeRideTwo(tandemRideTwo);
        bikeRide.ride();

//        System.out.println(bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(), 75);
    }



    //--------THIRD BIKE RIDE FOR TANDEM ---------
    @Test
    public void shouldThirdSpeedOfTandem(){
        Tandem tandemRideThree = new Tandem();
        BikeRideThree bikeRide = new BikeRideThree(tandemRideThree);
        bikeRide.ride();

//        System.out.println(bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(), 39);
    }
}
