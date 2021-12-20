package day2021_08_22;

import java.util.Scanner;

public class duplicateWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word1 = scan.next();
        String word2 = scan.next();
        String firstPrint= word1.substring(0,word1.length())+word2.substring(0,word2.length());
        String secondPrint=word2.substring(0,word2.length())+word1.substring(0,word1.length());

        System.out.println(firstPrint+secondPrint);








































    }
}
