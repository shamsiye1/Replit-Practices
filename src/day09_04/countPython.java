package day09_04;

import java.util.Scanner;

public class countPython {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();


        int countJava=0;
        int countPython=0;

        for(int i=0; i< sentence.length(); i++){

            if(sentence.charAt(i)=='j' && sentence.charAt(i+1)=='a' && sentence.charAt(i+2)=='v' && sentence.charAt(i+3)=='a'){
                countJava++;
            }


        }
       // System.out.println(countJava);

        for(int j=0; j< sentence.length(); j++){

            if(sentence.charAt(j)=='p' && sentence.charAt(j+1)=='y' && sentence.charAt(j+2)=='t' && sentence.charAt(j+3)=='h' && sentence.charAt(j+4)=='o' && sentence.charAt(j+5)=='n'){
                countPython++;
            }
//What's the difference between java, javascript and python
//
        }
      //  System.out.println(countPython);


       if(countJava==countPython){
           System.out.println("true");


      }else if(countJava !=countPython) {
           System.out.println("false");
//
//
       }

// 0
//What's the difference between java, javascript and python






































    }
}
