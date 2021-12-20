package day10_06;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveInstance {

    public static void main(String[] args) {

        ArrayList<Integer> r= new ArrayList<>(Arrays.asList(1,1,2,3,1,4));
        Integer n=1;

     r.removeIf(p -> p==n);

        System.out.println(r);

      //ArrayList<Integer> newR= new ArrayList<>();




    }
}
