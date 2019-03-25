package bicycles;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemSpecificationTest {
    @Test
    public void TandemBikeAccelerationSpecification(){
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7,BicycleType.TANDEM);
        System.out.println(tandemBikeSpec.getAccelerationSpeed());
        assertEquals(tandemBikeSpec.getAccelerationSpeed(), 12);
    }

    @Test
    public void TandemBIkeBrakeSpecification(){
        BicycleSpecification tandemBikeBrakeSPec = new BicycleSpecification(12,-7, BicycleType.TANDEM);
        assertEquals(tandemBikeBrakeSPec.getBrakeSpeed(), -7);

    }

    @Test
    public void TandemBikeSpec(){
    BicycleSpecification tandemBikeValues =  new BicycleSpecification(12,-7,BicycleType.TANDEM);
    Bicycle tandemBIkeSPec = new BicycleFromSpec(tandemBikeValues);
    BikeRideThree tandemForARide = new BikeRideThree(tandemBIkeSPec);
    tandemForARide.ride();

    assertEquals(39,tandemForARide.currentSpeed());
    }

    @Test
    public void ACCEPTTANDEMBIKES(){
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
    public void HOWMANYTANDEMBikes(){
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


        assertEquals(4, tandem.getCountForType(BicycleType.TANDEM));
    }

}
