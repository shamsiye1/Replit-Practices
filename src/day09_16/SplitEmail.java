package day09_16;

import java.util.Arrays;

public class SplitEmail {
    public static void main(String[] args) {
        String email = "info@cybertekschool.com";


        if (!email.contains("@")) {
            System.out.println("invalid email");
        } else {
            String[] emailArr = email.split("@");
            if (emailArr.length== 2) {
                System.out.println("Email id: " + emailArr[0]);
                System.out.println("Email domain: " + emailArr[emailArr.length - 1]);
            } else {
                System.out.println("invalid email");
            }

        }


    }
}
