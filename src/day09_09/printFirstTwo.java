package day09_09;

import java.util.Arrays;
import java.util.Scanner;

public class printFirstTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }

        int[] newNum= new int[size];
        if (size>2){

            newNum= new int[2];

            newNum[0]= num[0];
            newNum[1]= num[1];

        }else {
            newNum= new int[1];
            newNum[0]= num[0];
        }


        System.out.println(Arrays.toString(newNum));



    }












































    }
