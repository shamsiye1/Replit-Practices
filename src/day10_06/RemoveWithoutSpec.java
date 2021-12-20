package day10_06;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveWithoutSpec {

    public static void main(String[] args) {

        String str= "Ab,c,de!$"; // ed, c , bA!$

        char[] each= str.toCharArray();
//
        for(int i = 0; i< each.length/2; i++){

            if (!Character.isAlphabetic(each[i]) ){ // it means special character
                i++;
            } else {
                // use swap approach
                if(!Character.isAlphabetic(each[each.length-1-i]))
              // char temp= each[i];
               each[i]=each[each.length-1-i];
            //   each[each.length-1-i]= temp;
            }
        }

        System.out.println(Arrays.toString(each));

        String result="";
        for (int i=0; i< each.length; i++){

            result += each[i]+"";
        }
        System.out.println(result);

    }



}


