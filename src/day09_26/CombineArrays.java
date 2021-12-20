package day09_26;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineArrays {

    public static ArrayList<String> combineRs(String[] r1, String[] r2){

        // your code here


        ArrayList<String> wholeArr= new ArrayList<String>();

        for( String each: r1){

            wholeArr.add(each);
        }

        for (String each: r2){

            wholeArr.add(each);
        }


return wholeArr;

    }





}
