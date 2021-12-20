package day2021_08_18;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeNum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();

        int max=0;
        if (n1>n2 && n1>n3){
            System.out.println("n1 is bigger");
        }else if (n2>n1 && n2>n3){
            System.out.println("n2 is bigger");
        }else {
            System.out.println("n3 is bigger");
        }


//    int[] arr={n1,n2,n3};
//        Arrays.sort(arr);
//        System.out.println(arr[2]+ " is bigger");


















    }
}
