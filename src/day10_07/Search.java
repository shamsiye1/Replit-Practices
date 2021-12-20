package day10_07;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {

        String find="goodbaye";
        ArrayList<String> r=new ArrayList<>(Arrays.asList("hello","world"));

        for (String each: r){

            if (each.contains(find)){
                System.out.println(find+" "+ each);
            }else {
                System.out.println("search failed");
            }

        }


    }



}
