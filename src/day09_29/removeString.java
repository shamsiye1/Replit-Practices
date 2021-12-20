package day09_29;

import java.util.ArrayList;
import java.util.Arrays;

public class removeString {

    public static void main(String[] args) {

        String text="he said bla bla bla";
        String badWord="bla";

        String[] arr= text.split(" ");

        ArrayList<String> wordList= new ArrayList<>(Arrays.asList(arr));

        System.out.println(wordList);

        wordList.removeIf(p -> p.equalsIgnoreCase(badWord));

        System.out.println(wordList);

        String wordHolder="";

        for (String each: wordList){

            wordHolder +=each +" ";
        }

        System.out.println(wordHolder);

        String name = "he said bla bla bla";
        String a = " "+"bla";
        name = name.replace(a,"");
        System.out.println(name.trim());
//        int index = name.indexOf("1");
//        System.out.println(name.substring(0,index) + name.substring(index+1));












    }




}
