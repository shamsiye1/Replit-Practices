package day09_02;

import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        String word = scan.next();
        int countOfCats = 0;
        int countOfDogs = 0;
        for (int i=0; i< word.length(); i++){

            if (word.charAt(i)=='c' && word.charAt(i+1)=='a' && word.charAt(i+2)=='t'){
                countOfCats++;
            }
            if (word.charAt(i)=='d'&& word.charAt(i+1)=='o' && word.charAt(i+2)=='g'){
                countOfDogs++;
            }



        }
        if (countOfCats== countOfDogs){
            System.out.println("true");
        }else {
            System.out.println("false");
        }





















    }
}
