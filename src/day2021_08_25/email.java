package day2021_08_25;

import java.util.Scanner;

public class email {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String email= scan.next();


        int underScoreIndex= email.indexOf('_');

        int atSignIndex = email.indexOf('@');



       // System.out.println(firstName);

//        if (email.contains("_")){
//
//            System.out.println(lastName+ "_"+ firstName+"@gmail.com");
//
//        }else {
//            System.out.println(email);
//        }


        if (!email.contains("_")){
            System.out.println(email);
        }else {
            String firstName= email.substring(0,underScoreIndex);
            String lastName= email.substring(underScoreIndex+1,atSignIndex);
            System.out.println(lastName+ "_"+ firstName+"@gmail.com");
        }














































    }
}
