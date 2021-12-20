package day2021_08_25;

import java.util.Scanner;

public class SeperateEmail {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String email= scan.next();

        int underScore= email.indexOf('_');
        int atSign= email.indexOf('@');
        int dot= email.indexOf('.');

        String firstName= email.substring(0,underScore);
        String lastName= email.substring(underScore+1, atSign);
        String domain= email.substring(atSign+1,dot);

       firstName= ""+firstName.toUpperCase().charAt(0)+firstName.substring(1);
       lastName= ""+lastName.toUpperCase().charAt(0)+lastName.substring(1);



        System.out.println("First name: "+firstName+ "\nLast name: "+lastName+"\nDomain: "+domain );

































    }
}
