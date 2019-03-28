package bicycles.BikeRide;
import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideTwo;
import bicycles.rides.BikeRideThree;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideForTandem {
    @Test
    public void TandemWithBikeRideOne(){
        BicycleSpecification tandemBikeValues =  new BicycleSpecification(12,-7, BicycleType.TANDEM);
        Bicycle tandemBIkeSPec = new BicycleFromSpec(tandemBikeValues);
        BikeRideOne tandemForARide = new BikeRideOne(tandemBIkeSPec);
        tandemForARide.ride();

        assertEquals(34,tandemForARide.currentSpeed());
    }
    @Test
    public void TandemWithBikeRideTwo(){
        BicycleSpecification tandemBikeValues =  new BicycleSpecification(12,-7,BicycleType.TANDEM);
        Bicycle tandemBIkeSPec = new BicycleFromSpec(tandemBikeValues);
        BikeRideTwo tandemForARide = new BikeRideTwo(tandemBIkeSPec);
        tandemForARide.ride();

        assertEquals(75,tandemForARide.currentSpeed());
    }

    @Test
    public void TandemWithBikeRideThree(){
        BicycleSpecification tandemBikeValues =  new BicycleSpecification(12,-7,BicycleType.TANDEM);
        Bicycle tandemBIkeSPec = new BicycleFromSpec(tandemBikeValues);
        BikeRideThree tandemForARide = new BikeRideThree(tandemBIkeSPec);
        tandemForARide.ride();

        assertEquals(39,tandemForARide.currentSpeed());
    }



}
