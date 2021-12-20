package day10_08;

public class Split {
    public static void main(String[] args) {

        String info="jon,doe,30";

        String[] personalInfo= info.split(",");

        System.out.println("person name: "+personalInfo[0]);
        System.out.println("last name: "+personalInfo[1]);
        System.out.println("age: "+personalInfo[2]);


    }
}
