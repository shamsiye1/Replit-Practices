package day10_05;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveALL {
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

        String targetWord="hi";
     wordList.removeAll(Arrays.asList(targetWord));
        System.out.println(wordList);

    }
}
