package bicycles;
import bicycles.BicycleSpecification;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.AssertEquals.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeSpecificationTest {
    @Test
    public void RoadBikeAccelerationSpeedSpecification(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4,BicycleType.ROADBIKE);
//        System.out.println(roadBikeSpec.getAccelerationSpeed());
        assertEquals(roadBikeSpec.getAccelerationSpeed(),11);
    }

    @Test
    public void RoadBikeBrakeSpeedSpecification(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.ROADBIKE);
//        System.out.println(roadBikeSpec.getBrakeSpeed());
        assertEquals(roadBikeSpec.getBrakeSpeed(),-4);
    }

    @Test
    public void RoadBIKESPEC(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4,BicycleType.ROADBIKE);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();
//        System.out.println(bikeRide.currentSpeed());

        assertEquals(bikeRide.currentSpeed(),76);
    }

    @Test
    public void AddFunRideWithRoadBike(){
        FunRide funRoadBike = new FunRide(2);
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4,BicycleType.ROADBIKE);

        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
// ---- ADD BIKES ----
        funRoadBike.accept(bicycle);
        funRoadBike.accept(bicycle);
//-----------------------------------------TEST FOR ACCEPTED BIKE TYPE `-----------
//------------------------------------------TEST FOR NUMBER OF ROADBIKE -----------
        assertEquals("FUll!",funRoadBike.accept(bicycle));
    }

    @Test
    public void HowManyRoadBikeTypes(){
        FunRide roadBIke = new FunRide(3);
        BicycleSpecification roadBikeSPec  = new BicycleSpecification(11, -4, BicycleType.ROADBIKE);
        Bicycle roadBikeBicycle = new BicycleFromSpec(roadBikeSPec);

        BicycleSpecification tandemBike = new BicycleSpecification(12,-7, BicycleType.TANDEM);
        Bicycle tandemBicycle = new BicycleFromSpec(tandemBike);
        roadBIke.accept(roadBikeBicycle);
        roadBIke.accept(roadBikeBicycle);
        roadBIke.accept(roadBikeBicycle);
        roadBIke.accept(tandemBicycle);
//---- SHOULD GIVE ME A NUMBER OF ROADBIKES(3) IN THE FUNRIDE -----
//        System.out.printf("Number of Bikes --> %s", roadBIke.getCountForType(BicycleType.ROADBIKE));
        assertEquals(3,roadBIke.getCountForType(BicycleType.ROADBIKE));
    }

    @Test
    public void HowManyRoadBikes(){
        FunRide roadBIke = new FunRide(7);
        BicycleSpecification roadBikeSPec  = new BicycleSpecification(11, -4, BicycleType.ROADBIKE);
        Bicycle roadBikeBicycle = new BicycleFromSpec(roadBikeSPec);

        BicycleSpecification tandemBike = new BicycleSpecification(12,-7, BicycleType.TANDEM);
        Bicycle tandemBicycle = new BicycleFromSpec(tandemBike);
        roadBIke.accept(roadBikeBicycle);
        roadBIke.accept(roadBikeBicycle);
        roadBIke.accept(roadBikeBicycle);
        roadBIke.accept(roadBikeBicycle);
        roadBIke.accept(roadBikeBicycle);
        roadBIke.accept(tandemBicycle);
//---- SHOULD GIVE ME A NUMBER OF ROADBIKES(6) IN THE FUNRIDE -----
        assertEquals(6,roadBIke.getEnteredCount());
    }
}
