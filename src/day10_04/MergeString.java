package day10_04;

public class MergeString {
    public static void main(String[] args) {
        String one="java";
        String two="selenium";
        String str="";
        int mergeLength=one.length()+two.length();



        if (one.length()==two.length()){

            for (int i=0; i<one.length(); i++){

                str += ""+two.charAt(i)+one.charAt(i);
            }
        }else if (one.length()>two.length()) {
            for (int i = 0; i < one.length(); i++) {

                str += "" + two.charAt(i) + one.charAt(i);

            }
        }else if(two.length()>one.length()){
            for (int i = 0; i < two.length(); i++) {

                str += "" + two.charAt(i) + one.charAt(i);

            }
        }


        System.out.println(str);














    }
}
