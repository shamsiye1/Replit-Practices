package day09_22;

import java.util.ArrayList;
import java.util.Arrays;

public class findContainE {

    public static void main(String[] args) {

        String[] arr={"aa", "be", "lol", "lel", "oreo"};
        System.out.println(Arrays.toString(getWithE(arr)));

        ArrayList<String> names=new ArrayList<>();

        names.add("mubarak");
        names.add("nazakat");
        names.add("asiye");





    }


    public static String[] getWithE(String[] arr){

    String getE="";
    for (String each: arr){
        if (each.contains("e")){
            getE +=each+" ";
        }
    }

        String[] fewValues= getE.split(" ");




        return fewValues;
    }





}
