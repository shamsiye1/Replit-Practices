package day10_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TimeTwo {

    public static void main(String[] args) {

        ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(1,2,3,5));

        for (int i=0; i<nums.size();i++){

            nums.set(i,nums.get(i)*2);
        }

        System.out.println(nums);

    }


}
