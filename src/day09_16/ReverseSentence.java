package day09_16;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "java is fun";

        String[] arr = sentence.split(" ");


        String reverse = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse += arr[i] + " ";

        }
        System.out.println(reverse);


    }
}
