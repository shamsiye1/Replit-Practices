package day_09_28;

import java.util.Arrays;
import java.util.Scanner;

public class addElements {

    public static int[] addElements(int[] ints1, int[] ints2) {


        int[] newArr = new int[5];
        for (int i = 0; i < 5; i++) {

            newArr[i] = ints1[i] + ints2[i];


        }


        return newArr;
    }


    public static void main(String[] args) {
//
//        Scanner scan= new Scanner(System.in);
//        int[] nums1={10,40,50,3,1};
//        int[] nums2={11,0,500,44,1101};
//        System.out.println(Arrays.toString(addElements(nums1, nums2)));
        int[] a = {1, 2, 3};
        int[] b = {4, 5};
// {}
        int[] newArr = new int[a.length + b.length];

        int z = 0;
        for (int i = 0, q = 0; i < a.length; i++, q++) {

            newArr[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {

            newArr[a.length + i] = b[i];

        }

        System.out.println(Arrays.toString(newArr));

    }


}
