package bicycles;

import bicycles.models.Tandem;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
    private int max;
    List <Bicycle> bikeList = new ArrayList<>();
    public FunRide(int maxNum){
        this.max = maxNum;
    }

    public String Accept(Bicycle bicyleType){
         //EMPTY LIST SO
        if (bikeList.size() <= max){
            bikeList.add(bicyleType);
            return "Acceoted! ";

        }
            return "FUll!";

    }

    public int getCountForType(BicycleType getType){
        int counter = 0;
//      Use  a enhanced loop looping through the bikelist
        for(Bicycle bike : bikeList){

            if(bike.getBicycleType() == getType){
                counter++;
            }
        }
        return counter;
    }

    public static void main( String [] args){
        FunRide test = new FunRide(2);
            System.out.println(test.Accept());

    }
}
