package day09_04;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int counter=0;
        for(int i=0; i< word.length()-3; i++){

          //  String compare="java";

            if(word.substring(i,i+4).equals("java")){
                counter++;

            }

        }

        System.out.println(counter);
































    }
}
