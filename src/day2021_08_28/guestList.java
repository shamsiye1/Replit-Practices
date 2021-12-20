package day2021_08_28;

import java.util.Scanner;

public class guestList {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);


        String GuestName;
        String guestList="";


        for (int i=0; i<10; i++){
            System.out.println("Please enter guest name:");
            GuestName= input.next();
            guestList +=GuestName+ ", ";
            System.out.println("Do you want to enter new guest name:");
            String option= input.next();
            if (option.equalsIgnoreCase("yes")){

            }else if (option.equalsIgnoreCase("no")){
                break;
            }else {
                System.out.println("Invalid answer, re-enter guest name");
            }


        }
        System.out.println("Guest's list: "+guestList.trim().substring(0,guestList.length()-2));





































    }
}
