package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
//--
    private int max;

   private List <Bicycle> bikeList;

    public FunRide(int maxNum){
        this.max = maxNum;
        bikeList = new ArrayList<>();
    }

    public String accept(Bicycle bicyleType){
         //EMPTY LIST SO THAT ANY BIKETYPE CAN ENTER ON IT
        if (bikeList.size() < max){
            bikeList.add(bicyleType);
            return "Accepted!";
// BIKETYPE ADDED TO THE LIST NOW I NEEED TO CHECK HOW MANY IN THE LIST
        }
            return "FUll!";
    }

    public int getCountForType(BicycleType getType){
        int counter = 0;
//      I must use a enhanced loop looping through the bikelist
        for(Bicycle bike : bikeList){

            System.out.printf("type: --> %s", bikeList.size());
            if(bike.getBicycleType() == getType){
                counter++;
            }
        }
        return counter;
    }



//    public static void main( String [] args){
//        FunRide test = new FunRide(2);
//        //new bikespec (11, -4, moun)
//        test.Accept(BicycleType.MOUNTAINBIKE);
//        test.Accept(BicycleType.TANDEM);
//        test.Accept(BicycleType.ROADBIKE);
//        System.out.println(test.GetCountForType(BicycleType.ROADBIKE));
//    }

}
