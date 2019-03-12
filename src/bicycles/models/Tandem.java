package bicycles.models;

import bicycles.BicycleBase;

public class Tandem extends BicycleBase {
    @Override
    public void accelerate(){
        speed += 12;
    }
    @Override
    public void brake(){
        speed -=7;
    }
}
