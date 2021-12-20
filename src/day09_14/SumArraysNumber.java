package day09_14;

import java.util.Scanner;

public class SumArraysNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int total=0;
        for (int each: nums){
            total += each;
        }

        System.out.println(total);









































    }
}
