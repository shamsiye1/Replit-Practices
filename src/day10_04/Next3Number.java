package day10_04;

import java.util.Arrays;

public class Next3Number {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(next3(2)));


    }
    public static int[] next3(int num){

        int[] arr= new int[3];

        for (int i=num; i<3; i++){

            arr[i]= i+1;


        }


    return arr;
    }


}
