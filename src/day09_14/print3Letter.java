package day09_14;

import java.util.Scanner;

public class print3Letter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];

        //String[] arr={"hello", "how", "are", "you", "doing"};
        for (int i=0; i<5; i++){
           arr[i]=input.nextLine();

        }

        for (int i=0; i< arr.length; i++){

            String word= arr[i];
            String comWord="";

            for (int j=0; j< word.length(); j++){

               comWord= ""+word.charAt(0)+ word.charAt(1)+word.charAt(2);

            }

            System.out.println(comWord);

        }









































































    }
}
