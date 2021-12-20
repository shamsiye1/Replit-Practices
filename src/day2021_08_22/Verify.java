package day2021_08_22;

import java.util.Scanner;

public class Verify {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        String word = scan.nextLine();
        String sentence = scan.nextLine();

        boolean hasWord= sentence.contains(word);

        System.out.println(hasWord);





    }


}
