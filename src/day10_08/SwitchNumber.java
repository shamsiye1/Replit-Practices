package day10_08;

import java.util.Arrays;

public class SwitchNumber {
    public static void main(String[] args) {

        int[] i= {1,2,3,4};

       // int temp;

      int temp= i[0];
      i[0]= i[i.length-1];
      i[i.length-1]=temp;


        System.out.println(Arrays.toString(i));






    }
}
