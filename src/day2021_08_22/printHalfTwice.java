package day2021_08_22;

import java.util.Scanner;

public class printHalfTwice {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        String word= scan.next();

        String firstHalf= word.substring(0,word.length()/2);

        System.out.println(firstHalf+firstHalf);































    }
}
