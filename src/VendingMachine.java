import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int quarters, dimes, nickels, pennies;
        int cent= scan.nextInt();
        if (cent>0 && cent<100){
            quarters = cent/25;
            cent%=25;

            dimes= cent/10;
            cent%=10;

            nickels=cent/5;
            cent%=5;

            pennies=cent;
            System.out.println("Your change is "+ quarters+ " quarters, "+ dimes+" dimes, "+nickels+" nickels, and "+pennies+" pennies");

        }else {
            System.out.println("Invalid cents amount");
        }




















    }
}
