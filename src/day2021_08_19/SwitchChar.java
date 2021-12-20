package day2021_08_19;

import java.util.Scanner;

public class SwitchChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);

        String display = "";

        switch (response) {
            case 'y':
                display = "Your request is being processed";
                break;
            case 'n':
                display = "Thank you anyway for your consideration";
                break;
            case 'h':
                display = "Sorry, no help is currently available";
                break;
            default:
                display = "Invalid entry, please try again!";

        }
        System.out.println(display);


    }
}
