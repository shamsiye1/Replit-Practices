package day2021_08_15;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        String item= scan.nextLine();
        int  itemPrice=0;
        int balance=100;
        String result="";
//        String result="";
//        switch (item){
//            case "Blanket":
//                itemPrice= 60;
//                balance -=itemPrice;
//                result= "Thank you for your purchase!\nYour current balance is: "+ balance+"$";break;
//            case "Charger":
//                itemPrice= 25;
//                balance -=itemPrice;
//                result= "Thank you for your purchase!\nYour current balance is: "+ balance+"$";break;
//            case "Hat":
//                itemPrice= 25;
//                balance -=itemPrice;
//                result= "Thank you for your purchase!\nYour current balance is: "+ balance+"$";
//                break;
//            case "Headphones":
//                itemPrice= 30;
//                balance -=itemPrice;
//                result= "Thank you for your purchase!\nYour current balance is: "+ balance+"$";break;
//            case "Laptop":
//                itemPrice= 200;
//                balance -=itemPrice;
//                result= "Sorry, not enough funds on your gift card!";break;
//            case "Pants":
//                itemPrice= 50;
//                balance -=itemPrice;
//                result= "Thank you for your purchase!\nYour current balance is: "+ balance+"$";break;
//            case "Pillow":
//                itemPrice= 40;
//                balance -=itemPrice;
//                result= "Thank you for your purchase!\nYour current balance is: "+ balance+"$";break;
//            case "Smartphone":
//                itemPrice= 1000;
//                balance -=itemPrice;
//                result= "Sorry, not enough funds on your gift card!";break;
//            case "Socks":
//                itemPrice= 5;
//                balance -=itemPrice;
//                result= "Thank you for your purchase!\nYour current balance is: "+ balance+"$";break;
//            case "USB cable":
//                itemPrice= 10;
//                balance -=itemPrice;
//                result= "Thank you for your purchase!\nYour current balance is: "+ balance+"$";break;
//            default: result="Invalid item!";
//
//        }
//
//        System.out.println(result);

             if (item.equals("Hat")){
                 itemPrice= 25;
                balance -=itemPrice;
                result= "Thank you for your purchase!\nYour current balance is: "+ balance+"$";
             }else if (item.equals("Laptop")){
                 itemPrice= 200;
                balance -=itemPrice;
                result= "Sorry, not enough funds on your gift card!";
             }else if (item.equals("Blanket")){
                 itemPrice= 60;
                balance -=itemPrice;
                result= "Thank you for your purchase!\nYour current balance is: "+ balance+"$";
             }else {
                 result="Invalid item!";
             }

































    }
}
