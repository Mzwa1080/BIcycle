package bicycles.models;

import bicycles.BicycleBase;

public abstract class Tandem extends BicycleBase {
    public void accelerate(){
        speed += 12;
    }

    public void brake(){
        speed -=7;
    }
}
