package day09_22;

import java.util.Arrays;

public class ArrayAddElement {

    public static void main(String[] args) {

        int[] r={1,5,77,8};



    }

    public static void add_to_r(int[] r, int n){

        int[] newR= new int[r.length+1];

        for(int i=0;i< r.length; i++){

            newR[i]= r[i];

        }

        newR[newR.length-1]=n;

//        for(int each: newR){
//
//            System.out.println(each);
//
//        }  this way just for print newR element separately



    }

}
