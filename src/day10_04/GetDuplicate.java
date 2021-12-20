package day10_04;

public class GetDuplicate {
    public static void main(String[] args) {

       String[] r={"8","1","g","aabb","7","7","2","aa","7"};
        System.out.println(getDup(r));
//         int dup=0;
//       for (String each: r){
//           int counter=0;
//           for (int i=0; i< r.length; i++){
//
//               if (each==r[i]){
//
//                   counter++;
//               }
//           }
//
//          if (counter>1){
//              dup++;
//          }
//       }
//
//        System.out.println(dup);

    }

   public static int getDup(String[] r){

        int dupNum=0;
        for (String each: r){
            int counter=0;

            for (int i=0; i< r.length; i++){

                if (each== r[i]){
                    counter++;

                }
            }
            if (counter>1){
                dupNum++;
            }
        }



        return dupNum;
   }



}
