package day2021_08_17;

import java.util.Scanner;

public class blackJeck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int house = s.nextInt();
        int player = s.nextInt();

            if(player>21){
                System.out.println("player bust");
            }else {
                if (house>player){
                    System.out.println("player loss");
                }else if (house==player){
                    System.out.println("its a tie");
                }else {
                    System.out.println("player win");
                }
            }
    }







    }

