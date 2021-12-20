package day09_16;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortedWords {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
        String str = "olive,fish,pursuit,old,warning,python,java,coffee,cat,ray";


        String[] arr=str.split(",");

        System.out.println(Arrays.toString(arr));
        int min=Integer.MAX_VALUE;
        String shortWord="";
        int length = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i].trim().length()< min){
                min = arr[i].trim().length();
                length = arr[i].trim().length();
            }
        }
        System.out.println(length);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].trim().length()==length){
                shortWord += arr[i].trim() + ",";
            }
        }
        System.out.println(shortWord);
        String[] newArr=shortWord.split(",");
        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));
































    }
}
