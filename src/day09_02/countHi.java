package day09_02;

import java.util.Scanner;

public class countHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
       int count=0;

      for (int i=0; i < str.length(); i++){

         // int count = 0;
          if (str.length()==1){
             continue;
          }

          if (str.charAt(i)== 'h' && str.charAt(i+1)=='i'){

              count++;

          }

      }
        System.out.println(count);





















    }
}
