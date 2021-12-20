package day10_04;

public class FindError {

    public static void main(String[] args) {

        String str="foo bar";

        String startWord="error";

        if (str.startsWith(startWord)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }




    }


}
