package bicycles.rides.funride;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.FunRide;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideForRoadBike {
    @Test
    public void AddFunRideWithRoadBike(){
        FunRide funRoadBike = new FunRide(2);
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.ROADBIKE);

        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(roadBikeSpec);

        funRoadBike.accept(bicycle);
        funRoadBike.accept(bicycle2);

        assertEquals("FUll!",funRoadBike.accept(bicycle));
    }

    @Test
    public void HowManyRoadBikeTypes(){
        FunRide roadBIke = new FunRide(3);
        BicycleSpecification roadBikeSPec  = new BicycleSpecification(11, -4, BicycleType.ROADBIKE);
        Bicycle roadBikeBicycle1 = new BicycleFromSpec(roadBikeSPec);
        Bicycle roadBikeBicycle2 = new BicycleFromSpec(roadBikeSPec);
        Bicycle roadBikeBicycle3 = new BicycleFromSpec(roadBikeSPec);

        BicycleSpecification tandemBike = new BicycleSpecification(12,-7, BicycleType.TANDEM);
        Bicycle tandemBicycle = new BicycleFromSpec(tandemBike);

        roadBIke.accept(roadBikeBicycle1);
        roadBIke.accept(roadBikeBicycle2);
        roadBIke.accept(roadBikeBicycle3);
        roadBIke.accept(tandemBicycle);
        assertEquals(3,roadBIke.getCountForType(BicycleType.ROADBIKE));
    }

    @Test
    public void HowManyRoadBikes(){
        FunRide roadBIke = new FunRide(7);
        BicycleSpecification roadBikeSPec  = new BicycleSpecification(11, -4, BicycleType.ROADBIKE);
        Bicycle roadBikeBicycle = new BicycleFromSpec(roadBikeSPec);
        Bicycle roadBikeBicycle2 = new BicycleFromSpec(roadBikeSPec);
        Bicycle roadBikeBicycle3 = new BicycleFromSpec(roadBikeSPec);
        Bicycle roadBikeBicycle4 = new BicycleFromSpec(roadBikeSPec);
        Bicycle roadBikeBicycle5 = new BicycleFromSpec(roadBikeSPec);

        BicycleSpecification tandemBike = new BicycleSpecification(12,-7, BicycleType.TANDEM);
        Bicycle tandemBicycle = new BicycleFromSpec(tandemBike);
        roadBIke.accept(roadBikeBicycle);
        roadBIke.accept(roadBikeBicycle2);
        roadBIke.accept(roadBikeBicycle3);
        roadBIke.accept(roadBikeBicycle4);
        roadBIke.accept(roadBikeBicycle5);
        roadBIke.accept(tandemBicycle);
//---- SHOULD GIVE ME A NUMBER OF ROADBIKES(6) IN THE FUNRIDE -----
        assertEquals(6,roadBIke.getEnteredCount());
    }
}
