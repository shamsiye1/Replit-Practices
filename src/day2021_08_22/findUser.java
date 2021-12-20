package day2021_08_22;

import java.util.Scanner;

public class findUser {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName= scan.nextLine();
        fullName.equalsIgnoreCase(fullName);

       if (fullName.equalsIgnoreCase("Max Payne")|| fullName.equalsIgnoreCase("Alan Wake")){
           System.out.println("User found!");
       }else {
           System.out.println("User not found!");
       }


























    }
}
