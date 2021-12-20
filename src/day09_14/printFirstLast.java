package day09_14;

import java.util.Arrays;

public class printFirstLast {
    public static void main(String[] args) {


        String[] words = {"hello", "why", "by", "apple", "note"};
        String Eachword = "";
        for (int i = 0; i < words.length; i++) {

            //Eachword = words[i];

            Eachword += "" + words[i].charAt(0) + words[i].charAt(words[i].length()-1)+" ";
//            for (int j = 0; j < Eachword.length(); j++) {
//                Eachword = "" + Eachword.charAt(0) + Eachword.charAt(Eachword.length()-1);
//            }

            // Eachword += Eachword;

            // String[] newWords = Eachword.split(",");

            System.out.println(Eachword);
        }
        System.out.println(Eachword);
        String arr[] = Eachword.split(" ");
        System.out.println( Arrays.toString(arr));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String[] words2 = {"hello", "why", "by", "apple", "note"};
        String[] arr2 = new String[words2.length];
        for (int i = 0; i < arr2.length; i++) {
          arr2[i] = "" + words2[i].charAt(0) + words2[i].charAt(words2[i].length()-1);
        }

        System.out.println( Arrays.toString(arr2));

        System.out.println("---------------------------------------------------");

        String[] words3 = {"hello", "why", "by", "apple", "note"};
        String newReturn = "";
        for (int i = 0; i < words3.length; i++) {
            String hold = words3[i];
            newReturn = "" + hold.charAt(0) + hold.charAt(hold.length()-1);
            System.out.println(newReturn);
        }

        System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");

        String name = "miradel.mijit,xamsiya,ablimit";
        String eachName[] =  name.split(".");
        System.out.println(Arrays.toString(eachName));


    }
}
