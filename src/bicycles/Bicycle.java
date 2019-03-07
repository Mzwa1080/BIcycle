package bicycles;

public class Bicycle {
    private int speed;

    public void accelerate(){
        speed += 5;
//        System.out.printf("This is a Speed:%s", speed);
    }

    public void brake(){
        speed -=3;
//        int value = speed - brakee; //speed - 3;
//        System.out.printf("This is the speed after braked: %s", this.speed);
    }

    public int currentSpeed(){
//        System.out.printf("This is the speed after braked: %s", this.speed);
        return speed;
    }

    public void stop(){
//        System.out.printf("1st speed in the stop: %s", + speed);
         speed=0;
    }

//    public static void main(String[] args){
//        Bicycle getValue = new Bicycle();
////        getValue.accelerate();
//        getValue.brake();
////        getValue.currentSpeed();
////        getValue.stop();
//    }
}
