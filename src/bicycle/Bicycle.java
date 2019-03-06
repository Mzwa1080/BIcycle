package bicycle;

public class Bicycle {
    private int speed;
    private int decrease;
    private int currentSpeed;
    private int stop;

    public void accelerate(){
        speed = 5;
    }

    public void brake(){
        decrease = this.speed - 3; //speed - 3;
    }

    public int currentSpeed(){
         int speed = this.speed;
        return speed;
    }

    public int stop(){

        return this.speed = 0;
    }
}
