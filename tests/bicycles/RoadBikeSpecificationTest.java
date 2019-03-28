package bicycles;


import bicycles.specification.BicycleSpecification;
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


}
