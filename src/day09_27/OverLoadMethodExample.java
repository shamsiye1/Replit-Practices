package day09_27;

public class OverLoadMethodExample {

    public static int findMax(int[] arr){

        int max= Integer.MIN_VALUE;

        for (int each: arr){

            if (each>max){
                max=each;
            }

        }

        return max;
    }

    public static double findMax(double[] arr){

        double max= Integer.MIN_VALUE;

        for (double each: arr){

            if (each>max){
                max=each;
            }

        }

        return max;
    }









}
