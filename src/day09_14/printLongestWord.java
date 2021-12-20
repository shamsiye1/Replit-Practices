package day09_14;

import java.util.Scanner;

public class printLongestWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }
       String longestWord="";
        for (int i=0; i< words.length; i++){

            String currentWord= words[i];
            if (currentWord.length()> longestWord.length()){
                longestWord=currentWord;

            }

        }
        System.out.println(longestWord);




       }



































































































    }


