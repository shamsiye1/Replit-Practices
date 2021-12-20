package day10_06;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatAll {

    public static void main(String[] args) {

        ArrayList<Boolean> value= new ArrayList<>(Arrays.asList(true, false, false));

        value.addAll(value);


        System.out.println(value);
      //  ArrayList<Boolean> valueNew= new ArrayList<>(value);




    }

}


