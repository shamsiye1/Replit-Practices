package day2021_08_22;

import java.util.Scanner;

public class findMiddle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int length = word.length();

        if (length % 2 == 1) {

            if (length >= 3) {
                System.out.println(word.charAt(length / 2));
            } else if (length == 1) {
                System.out.println("" + word.charAt(0) + word.charAt(0) + word.charAt(0));
            }

        } else {
            if (length == 2) {
                System.out.println("" + word.charAt(0) + word.charAt(1) + word.charAt(0) + word.charAt(1));
            } else
                System.out.println("" + word.charAt(length / 2 - 1) + word.charAt(length / 2));
        }


    }
}
