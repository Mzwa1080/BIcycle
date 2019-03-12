package bicycles;

public class BikeRide  {
    private final Bicycle bicycle;

    public BikeRide(Bicycle bicycle) {
        //HOw can this constructor use interface????? -- how to use interface in contructor;
           this.bicycle = bicycle;
        }
//   Should I have 3 parameters in my constructor or two deleting the object of the BikeRide
//    Coz now the RoadBIke and the MOuntainBIke are declared but never used!!!

    public void ride(){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

//    public void ride2(){
//        this.bicycle.accelerate();
//    }


    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }


}
