package day2021_08_31;

import java.util.Scanner;

public class inhabitants {
    public static void main(String[] args) {

      Scanner scan= new Scanner(System.in);
      int inhabitants = scan.nextInt();
//      int day=0;
//
//    while (inhabitants>0){
//        inhabitants = inhabitants/2;
//        System.out.println("Day"+ day + " ["+ inhabitants+"]");
//        day++;
//
//      }

      //System.out.println("---- EXTINCT ----");


for (int i=0; i<= inhabitants; i++){
    inhabitants  = inhabitants/2;
    System.out.println("Day"+ i + " ["+ inhabitants+"]");

}
        System.out.println("---- EXTINCT ----");




























    }
}
