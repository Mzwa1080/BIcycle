package bicycles;

import bicycles.specification.BicycleSpecification;
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


}
