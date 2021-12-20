package day2021_08_19;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUT CODE HERE:

       int result=  (x >=5)? x: -x;
//       int result1= (x<5)? -x :5;


        System.out.println(result);
















    }
}
