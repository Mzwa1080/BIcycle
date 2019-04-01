package bicycles.rides.funride;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.FunRide;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideForTandemBike {

    @Test
    public void AcceptTandemBikes(){
        FunRide tandemBIke = new FunRide(3);
        BicycleSpecification tandemValues = new BicycleSpecification(12, -7, BicycleType.TANDEM);
        Bicycle mountainBicycle = new BicycleFromSpec(tandemValues);
        Bicycle mountainBicycle2 = new BicycleFromSpec(tandemValues);

        BicycleSpecification RoadBikeBicycle  = new BicycleSpecification(11,-4,BicycleType.ROADBIKE);
        Bicycle roadBike = new BicycleFromSpec(RoadBikeBicycle);

        BicycleSpecification tandem  = new BicycleSpecification(5,-3,BicycleType.MOUNTAINBIKE);
        Bicycle tandemBike = new BicycleFromSpec(tandem);
        Bicycle tandemBike2 = new BicycleFromSpec(tandem);

        tandemBIke.accept(mountainBicycle);
        tandemBIke.accept(mountainBicycle2);
        tandemBIke.accept(roadBike);
        tandemBIke.accept(tandemBike);
        tandemBIke.accept(tandemBike2);
        assertEquals("FUll!", tandemBIke.accept(mountainBicycle));
    }

    @Test
    public void HowManyTandemBikesTypes(){
        FunRide tandem = new FunRide(8);
        BicycleSpecification tandemValues = new BicycleSpecification(12, -7, BicycleType.TANDEM);
        Bicycle tandemSpec = new BicycleFromSpec(tandemValues);
        Bicycle tandemSpec2 = new BicycleFromSpec(tandemValues);
        Bicycle tandemSpec3 = new BicycleFromSpec(tandemValues);
        Bicycle tandemSpec4 = new BicycleFromSpec(tandemValues);
        Bicycle tandemSpec5 = new BicycleFromSpec(tandemValues);

        BicycleSpecification RoadBikeValues  = new BicycleSpecification(11,-4,BicycleType.ROADBIKE);
        Bicycle roadBike = new BicycleFromSpec(RoadBikeValues);

        BicycleSpecification mountainBikeValues  = new BicycleSpecification(5,-3,BicycleType.MOUNTAINBIKE);
        Bicycle mountainBIke = new BicycleFromSpec(mountainBikeValues);
        Bicycle mountainBIke2 = new BicycleFromSpec(mountainBikeValues);

        tandem.accept(tandemSpec2);
        tandem.accept(tandemSpec);
        tandem.accept(tandemSpec3);
        tandem.accept(tandemSpec4);
        tandem.accept(roadBike);
        tandem.accept(mountainBIke);
        tandem.accept(mountainBIke2);

//        System.out.println(tandem.getEnteredCount());
        assertEquals(4, tandem.getCountForType(BicycleType.TANDEM));
    }

    @Test
    public void HowManyTandemBikes(){
        FunRide tandem = new FunRide(9);
        BicycleSpecification tandemValues = new BicycleSpecification(12, -7, BicycleType.TANDEM);
        Bicycle tandemSpec = new BicycleFromSpec(tandemValues);
        Bicycle tandemSpec2 = new BicycleFromSpec(tandemValues);
        Bicycle tandemSpec3 = new BicycleFromSpec(tandemValues);

        BicycleSpecification RoadBikeValues  = new BicycleSpecification(11,-4,BicycleType.ROADBIKE);
        Bicycle roadBike = new BicycleFromSpec(RoadBikeValues);


        tandem.accept(tandemSpec3);
        tandem.accept(tandemSpec2);
        tandem.accept(tandemSpec);
        tandem.accept(roadBike);

        assertEquals(4, tandem.getEnteredCount());
    }

}
