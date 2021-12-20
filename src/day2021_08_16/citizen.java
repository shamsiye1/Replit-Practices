package day2021_08_16;

import java.util.Scanner;

public class citizen {
    public static void main(String[] args) {
        int seniorCitizens, nonSeniorCitizens, age;

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        seniorCitizens= scan.nextInt();
        nonSeniorCitizens= scan.nextInt();
        System.out.println("What is new citizen's age?");
        age= scan.nextInt();

        String result="";
        if (age>=65){
            ++seniorCitizens;
            result="Senior Citizen";
        }else if (age<65){
            ++nonSeniorCitizens;
            result="Non-Senior Citizen";
        }
        System.out.println(result);
        System.out.println("New seniorCitizens count "+ seniorCitizens);
        System.out.println("New nonSeniorCitizens count "+nonSeniorCitizens);












































    }
}
