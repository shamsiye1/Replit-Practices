package day09_27;

public class getDup {

    public static int getDup(String[] r){

        int dup=0;
       for (int i=0; i< r.length; i++){

           int count=0;

           for (String each: r){

               if (r[i]==each){

                   count++;
               }

               if (count !=1){
                count = dup;

               }
           }



       }



      return dup;

    }





}
