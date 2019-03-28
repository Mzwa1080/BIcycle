package bicycles;

import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideForTandemBike {

    @Test
    public void AcceptTandemBikes(){
        FunRide tandemBIke = new FunRide(3);
        BicycleSpecification tandemValues = new BicycleSpecification(12, -7, BicycleType.TANDEM);
        Bicycle mountainBicycle = new BicycleFromSpec(tandemValues);

        BicycleSpecification RoadBikeBicycle  = new BicycleSpecification(11,-4,BicycleType.ROADBIKE);
        Bicycle roadBike = new BicycleFromSpec(RoadBikeBicycle);

        BicycleSpecification tandem  = new BicycleSpecification(5,-3,BicycleType.MOUNTAINBIKE);
        Bicycle tandemBike = new BicycleFromSpec(tandem);

        tandemBIke.accept(mountainBicycle);
        tandemBIke.accept(mountainBicycle);
        tandemBIke.accept(mountainBicycle);
        tandemBIke.accept(mountainBicycle);
        tandemBIke.accept(roadBike);
        tandemBIke.accept(tandemBike);
        tandemBIke.accept(tandemBike);


        assertEquals("FUll!", tandemBIke.accept(mountainBicycle));
    }


    @Test
    public void HowManyTandemBikesTypes(){
        FunRide tandem = new FunRide(8);
        BicycleSpecification tandemValues = new BicycleSpecification(12, -7, BicycleType.TANDEM);
        Bicycle tandemSpec = new BicycleFromSpec(tandemValues);

        BicycleSpecification RoadBikeValues  = new BicycleSpecification(11,-4,BicycleType.ROADBIKE);
        Bicycle roadBike = new BicycleFromSpec(RoadBikeValues);

        BicycleSpecification mountainBikeValues  = new BicycleSpecification(5,-3,BicycleType.MOUNTAINBIKE);
        Bicycle tandemBike = new BicycleFromSpec(mountainBikeValues);

        tandem.accept(tandemSpec);
        tandem.accept(tandemSpec);
        tandem.accept(tandemSpec);
        tandem.accept(tandemSpec);
        tandem.accept(roadBike);
        tandem.accept(tandemBike);
        tandem.accept(tandemBike);

//        System.out.println(tandem.getEnteredCount());
        assertEquals(4, tandem.getCountForType(BicycleType.TANDEM));
    }

    @Test
    public void HowManyTandemBikes(){
        FunRide tandem = new FunRide(2);
        BicycleSpecification tandemValues = new BicycleSpecification(12, -7, BicycleType.TANDEM);
        Bicycle tandemSpec = new BicycleFromSpec(tandemValues);

        BicycleSpecification RoadBikeValues  = new BicycleSpecification(11,-4,BicycleType.ROADBIKE);
        Bicycle roadBike = new BicycleFromSpec(RoadBikeValues);

        BicycleSpecification mountainBikeValues  = new BicycleSpecification(5,-3,BicycleType.MOUNTAINBIKE);
        Bicycle tandemBike = new BicycleFromSpec(mountainBikeValues);

        tandem.accept(tandemSpec);
        tandem.accept(tandemSpec);
        tandem.accept(tandemSpec);
        tandem.accept(tandemSpec);
        tandem.accept(roadBike);
        tandem.accept(tandemBike);
        tandem.accept(tandemBike);

        System.out.println(tandem.getEnteredCount());
        assertEquals(2, tandem.getEnteredCount());
    }

}
