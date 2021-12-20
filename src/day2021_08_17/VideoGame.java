package day2021_08_17;

import java.util.Scanner;

public class VideoGame {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter number of coupons:");

        int coupons, candyNum, gumballNum;
        coupons= scan.nextInt();


       if (coupons>3){
           candyNum= coupons/10;
           coupons%=10;

           gumballNum= coupons/3;
           coupons%=3;

           System.out.println("Number of Candies: "+ candyNum);
           System.out.println("Number of Gumballs: "+ gumballNum);
       }else {
           System.out.println("Not enough coupons");
       }

















































    }
}
