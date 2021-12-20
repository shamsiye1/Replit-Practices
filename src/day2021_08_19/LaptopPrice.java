package day2021_08_19;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class LaptopPrice {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Select screen size:");
        double screenSize= scan.nextDouble();


        System.out.println("Select CPU type:");
        String CPUType= scan.next();

        System.out.println("Select RAM size:");
        int RAMSize= scan.nextInt();

        System.out.println("Select storage type:");
        String storageType= scan.next();

        System.out.println("Enter memory size:");
        double memorySize= scan.nextDouble();

        System.out.println("Enter screen resolution:");
        String screenResolution= scan.next();

        double laptopPrice=0;


        if (screenSize==13.3){
              laptopPrice +=200;
        }
        if (screenSize==15.0){
            laptopPrice +=300;
        }
        if (screenSize==17.3){
            laptopPrice +=400;
        }

        if (CPUType.equals("i3")){
            laptopPrice +=150;
        }
        if (CPUType.equals("i5")){
            laptopPrice +=250;
        }
        if (CPUType.equals("i7")){
            laptopPrice +=350;
        }

        if (RAMSize%4==0){
           // 4 50
            laptopPrice += RAMSize/4*50;

        }else {
            laptopPrice += (RAMSize/4 +1) *50;
        }


        if (storageType.equals("HDD")){
            laptopPrice += memorySize/500*50;

        }else if (storageType.equals("SSD")){
            laptopPrice += memorySize/500*100;
        }

        if (screenResolution.equals("FULLHD")){
            laptopPrice += 100;
        }else if (screenResolution.equals("4K")){
            laptopPrice +=200;
        }

        System.out.println("Laptop price is: $"+laptopPrice);








































    }
}
