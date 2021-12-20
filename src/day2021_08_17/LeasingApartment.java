package day2021_08_17;

import java.util.Scanner;

public class LeasingApartment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;

        switch (numberOfBedrooms){
            case 1:
                startingPrice+=1100;
                System.out.println("One Bedroom Selected");
                System.out.println("Starting Price: "+startingPrice);
                break;
            case 2:
                startingPrice +=1850;
                System.out.println("Two Bedroom Selected");
                System.out.println("Starting Price: "+startingPrice);
                break;
            case 3:
                startingPrice +=2550;
                System.out.println("Three Bedroom Selected");
                System.out.println("Starting Price: "+startingPrice);
                break;
            default:
                System.out.println("No such Bedrooms available");
        }


















































    }
}
