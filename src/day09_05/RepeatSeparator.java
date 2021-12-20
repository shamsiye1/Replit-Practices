package day09_05;

import java.util.Scanner;

public class RepeatSeparator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String plus= "";

        for (int i=1; i <= count-1; i++){

            plus += word+separator;


        }

        System.out.print(plus);

































    }
}
