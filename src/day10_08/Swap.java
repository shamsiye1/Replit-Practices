package day10_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Swap {
    public static void main(String[] args) {


        ArrayList<String> list= new ArrayList<>(Arrays.asList("one","two","three"));


        int pos1=0;
        int pos2=2;

        Collections.swap(list, pos1,pos2);

        String temp=list.get(pos1);
         list.set(pos1,list.get(pos2));
         list.set(pos2, temp);
        System.out.println(list);











    }
}
