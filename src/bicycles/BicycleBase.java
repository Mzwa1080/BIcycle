package bicycles;

public abstract class BicycleBase implements Bicycle{
    protected int speed;

    @Override
    public int currentSpeed() {
        return this.speed;
    }

    @Override
    public void stop() {
        this.speed = 0;
    }

    @Override
    public int changeSpeed(int newSpeed){
        return this.speed += newSpeed;
    }

    public BicycleType getBicycleType(BicycleType bicycleType){
          return bicycleType;
    }

}
