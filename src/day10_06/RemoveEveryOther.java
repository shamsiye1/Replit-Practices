package day10_06;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEveryOther {

    public static void main(String[] args) {

        ArrayList<String> words= new ArrayList<>(Arrays.asList("car", "koi", "fish", "juice", "storm","right"));
        ArrayList<String> newWords= new ArrayList<>();
        for (int i=0; i<words.size(); i++){

           if (i%2==1){
               newWords.add(words.get(i));
           }
        }

       // System.out.println(newWords);
    }

}
