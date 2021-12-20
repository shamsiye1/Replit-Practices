package day09_16;

import java.util.Arrays;

public class zombieAttack {
    public static void main(String[] args) {

        int[] inhabitants={3, 6, 0, 4, 3, 2, 7, 1};
        System.out.println("Day 0"+Arrays.toString(inhabitants));

        int j = 1;
        while (sumOfArray(inhabitants) != 0) {
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] = inhabitants[i] / 2 ;
            }
            System.out.println("Day " + j + Arrays.toString(inhabitants));
            j++;
        }
    }

    public static int sumOfArray(int arr[]){
        int sum =0;
        for (int each : arr ) {
            sum += each;
        }
        return sum;
    }
}
