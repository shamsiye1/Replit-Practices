package day09_05;

import java.util.Scanner;

public class printVowel {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below


        //aeiou

       for (int i=0; i< word.length(); i++){

           if (word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o'|| word.charAt(i)=='u' ){
               System.out.print(word.charAt(i));
           }

       }






































    }
}
