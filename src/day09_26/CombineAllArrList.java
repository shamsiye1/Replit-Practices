package day09_26;

import java.util.ArrayList;

public class CombineAllArrList {


    public static ArrayList<Integer> combineAL( ArrayList<Integer> numbersOne, ArrayList<Integer> numbersTwo){

        ArrayList<Integer> wholeNumber= new ArrayList<>(numbersOne.size()+numbersTwo.size());

        for (int each: numbersOne){

            wholeNumber.add(each);

        }

        for (int each: numbersTwo){
            wholeNumber.add(each);

        }




        return wholeNumber;
    }





}
