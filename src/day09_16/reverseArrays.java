package day09_16;

import java.util.Arrays;

public class reverseArrays {
    public static void main(String[] args) {

      int[] nums={4, 3, 2, 44, 1, 100, 55};


     for (int i=0; i<nums.length/2; i++){
         int temp= nums[i];
         nums[i]=nums[(nums.length-1)-i];
         nums[(nums.length-1)-i]=temp;

     }

        System.out.println(Arrays.toString(nums));









































































    }
}
