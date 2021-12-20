package day10_04;

import java.util.Scanner;

public class PlindromeNumber {
    public static void main(String[] args) {

//        Scanner
         int num=1234;
         String str=""+num;
       String palindrome="";
       boolean isPalindrome= true;
       for(int i=str.length()-1; i>=0; i--){

           palindrome +=""+ str.charAt(i);
       }

       if(palindrome.equalsIgnoreCase(str)){
           isPalindrome=true;
       }else {
           isPalindrome=false;
       }

        System.out.println(isPalindrome);

    }

}
