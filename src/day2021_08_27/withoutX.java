package day2021_08_27;

import java.util.Scanner;

public class withoutX {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      String word = scan.next();
      boolean exists = false;
//
//        if (word.startsWith("x") || word.endsWith("X")){
//            System.out.println(word.substring(1,word.length()));
//        }else {
//            System.out.println(word);
//        }


//        if (word.startsWith("x")){
//            System.out.println(word.substring(1));
//        }else if (word.endsWith("X")){
//            System.out.println(word.substring(0,word.length()));
//        }else if (word.startsWith("x") && word.endsWith("X")){
//            System.out.println(word.substring(1,word.length()));
//        }else {
//            System.out.println(word);
//        }

          if (word.startsWith("java") ){
              System.out.println(!exists);
          }else if(word.substring(1).startsWith("java")){
            System.out.println(!exists);
        }else {
              System.out.println(exists);
          }

//
//        if (word.startsWith("j") && word.contains("java")){
//            System.out.println(!exists);
//        }else if(word.substring(1).startsWith("j") && word.contains("java")){
//            System.out.println(!exists);
//        }else {
//            System.out.println(exists);
//        }



















    }
}
