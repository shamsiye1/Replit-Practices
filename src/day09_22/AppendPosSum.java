package day09_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppendPosSum {

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> intt){

        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        for (int each: intt){

            if (each>0){
                list.add(each);
                sum +=each;
            }
        }


        list.add(sum);

     return list;
    }

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(6);

        System.out.println("appendPosSum(integerArrayList) = " + appendPosSum(integerArrayList));
    }

}
