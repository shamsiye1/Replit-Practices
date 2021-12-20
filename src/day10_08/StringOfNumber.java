package day10_08;

public class StringOfNumber {
    public static void main(String[] args) {
        String s="aa2aa3";
        String result="";
        char[] arr=s.toCharArray();

        for (char each: arr){

            if (Character.isDigit(each)){
                result +=each;

            }

        }


        System.out.println(result);

    }
}
