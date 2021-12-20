package day2021_08_27;

import java.util.Scanner;

public class shoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            System.out.println("Add one more item?");
            countinue = scan.next();
            shoppingListReport += "Item" + count + ": " + item + " Price: " + price + ", ";
            totalPrice += +price;

            if (countinue.equalsIgnoreCase("yes")) {
                count++;
            } else if (countinue.equalsIgnoreCase("no")) {
                break;
            }


        }


        System.out.println(shoppingListReport.trim().substring(0,shoppingListReport.length()-2));
        System.out.println("Total price: " + totalPrice);


    }
}
