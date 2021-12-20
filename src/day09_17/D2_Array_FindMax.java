package day09_17;

import java.util.Scanner;

public class D2_Array_FindMax {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows

       int max= arr[0][0];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
               if (arr[i][j]>max){
                   max =arr[i][j];
               }
            }//end for cols
        }//end for rows

        System.out.println(max);








    }
}
