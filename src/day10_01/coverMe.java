package day10_01;

public class coverMe {

    public static void main(String[] args) {
        String main= "java methods";
        String cover="me";

        String result="";

        if(main.contains(cover)){

            String newCover="["+cover+"]";
            result= main.replaceAll(cover,newCover);

        }else {
            result= main;

        }
        System.out.println(result);
    }
}
