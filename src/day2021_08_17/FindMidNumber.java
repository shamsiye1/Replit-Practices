package day2021_08_17;

import java.util.Arrays;
import java.util.Scanner;

public class FindMidNumber {
    public static void main(String[] args) {

        int num1 , num2, num3, midNum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1= scan.nextInt();

        System.out.println("Enter second number:");
        num2= scan.nextInt();

        System.out.println("Enter third number:");
        num3= scan.nextInt();

        midNum=0;
        int arr[] = {num1,num2,num3};
        Arrays.sort(arr);
        System.out.println(arr[1]);



//        if ((num1>num2 && num1<num3) || (num1< num2 && num1>num3)){
//            midNum= num1;
//            System.out.println("Medium value is: "+ midNum);
//        }else if ((num2> num1 && num2< num3) || (num2< num1 && num2>num3)){
//            midNum= num2;
//            System.out.println("Medium value is: "+ midNum);
//        }else if((num3>num1 && num3<num2)|| (num3<num1 && num3> num2)){
//            midNum= num3;
//            System.out.println("Medium value is: "+ midNum);
//        }



//        (num3>num1 && num3<num2)|| (num3<num1 && num3> num2)

//        boolean aIsMed = ( a > b && a < c) || ( a<b && a >c);
//        boolean bIsMed = ( b > a && b < c) || ( b< a && b>c);
//        boolean cIsMed = ( c > a && c < b) || (c <a && c > b);































    }
}
