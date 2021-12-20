package day2021_08_17;

import java.util.Scanner;

public class HappySchool {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter age:");
        int age = input.nextInt();
         String result= "";
        if (age>0 && age<2){
            result="ineligible";
        }else if (age<3){
            result="toddler";
        }else if (age<5){
            result="early childhood";
        }else if (age<7){
            result="young reader";
        }else if (age<10){
            result="elementary";
        }else if (age<12){
            result="middle";
        }else if (age==13){
            result="impossible";
        }else if (age<16){
            result="high school";
        }else if (age<18){
            result="scholar";
        }else if (age>18){
            result= "ineligible";
        }

        System.out.println(result);

























    }
}
