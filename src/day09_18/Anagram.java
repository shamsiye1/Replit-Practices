package day09_18;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));


    }





    public static boolean isAnagram(String word1, String word2){

     char[] wordOne= word1.toLowerCase().toCharArray();
     char[] wordTwo= word2.toLowerCase().toCharArray();


        Arrays.sort(wordOne);
        Arrays.sort(wordTwo);



        return Arrays.equals(wordOne,wordTwo);
    }

}
