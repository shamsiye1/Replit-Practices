package day10_04;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {

        String str= " Nurses Run";
        //str = str.trim();
        if(str.contains(" "))
            str = str.replaceAll(" ",""); // ===> also the important part in palindrome task

        String palindrome="";
        boolean isPalindrome= false;
        for (int i= str.length()-1; i>=0; i--){

            palindrome +=""+str.charAt(i);
        }

        if (palindrome.equalsIgnoreCase(str)){

          isPalindrome= true;
        }else {
            isPalindrome=false;
        }


        System.out.println(isPalindrome);






























    }
}
