package day2021_08_25;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class carInsurance {
    public static void main(String[] args) {

        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        //  int zipCode=0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");

        System.out.println("Enter your name");
        name = scan.nextLine();

        System.out.println("Do you have a US driver license?");
        String DriverLicense = scan.nextLine();
        if (!DriverLicense.equalsIgnoreCase("yes")) {
            System.out.println("Invalid data!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");

        int zipCode = scan.nextInt();
        System.out.println();
        if (zipCode == 20910 || zipCode == 20740) {
            premium += 60;
        } else if (zipCode == 22102 || zipCode == 22103) {
            premium += 30;
        } else {
            premium += 50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.nextLine();
        System.out.println();
        if (vehicleOwnership.equalsIgnoreCase("owned")) {
            premium += 10;
        } else {
            premium += 20;
        }

        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.nextLine();
        if (vehicleUsage.equalsIgnoreCase("business")) {
            premium += 50;
        } else if (vehicleUsage.equalsIgnoreCase("Commute")) {
            premium += 20;
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool = scan.nextInt();
            premium += daysDrivenToWorkOrSchool * 5;
            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();
            System.out.println();
            premium += milesToWorkOrSchool + milesToWorkOrSchool;
        } else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
            premium += 10;
        }
        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age < 16) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else if (age >= 16 && age < 18) {
            premium *= 20;
        } else if (age >= 18 && age <= 21) {
            premium *= 6;

        } else if (age > 21 && age < 25) {
            premium *= 2;
        }

        System.out.println("How many years you've been driving?");
        int experienceYear = scan.nextInt();
        if (experienceYear > 0 && age - experienceYear >= 16) {
            premium -= experienceYear * 5;
        } else {
            System.out.println("Invalid data!");
            System.exit(0);
        }
        System.out.println();
        System.out.println("Have you had any accidents in the last 5 years?");
        String accident = scan.nextLine();
        if (accident.equalsIgnoreCase("yes")) {
            System.out.println("How many?");
            premium += accidentsAmount * 0.2;
        }

        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.nextLine();
        if (continuousInsurance.equalsIgnoreCase("no")) {
            premium = premium * premium;
        }
        System.out.println();
        System.out.println("What is the highest level of education you have completed?");
        education = scan.nextLine();
        if (education.equalsIgnoreCase("phd") || education.equalsIgnoreCase("bachelors") || education.equalsIgnoreCase("masters")) {
            premium -= premium * 0.05;
        } else if (education.equalsIgnoreCase("doctors")) {
            premium -= premium * 0.1;
        } else if (education.equalsIgnoreCase("Less than high school")) {
            premium += premium * 0.05;
        }


        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);
        referenceNumber = name.substring(0, 2) + age + name.substring(name.length() - 2, name.length()) + zipCode + education;
        System.out.println("Reference number: " + referenceNumber.toUpperCase());


    }
}
