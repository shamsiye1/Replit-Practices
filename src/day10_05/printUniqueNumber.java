package day10_05;

public class printUniqueNumber {
    public static void main(String[] args) {


      int[] nums={2, 5, 5, 6, 3, 6, 9, 34, 3};

       for(int i=0; i<nums.length; i++){

           boolean isUnique= true;
           for (int j=0; j<nums.length; j++){

               if (i !=j && nums[i] ==nums[j]){
                   isUnique=false;
                   break;
               }

           }
         if (isUnique){
             System.out.println(nums[i]);
         }
       }

       String text="aabddcdf";
       String result="";
       for (int i=0; i<text.length(); i++){

           boolean isUnique=true;
           for (int j=0; j<text.length(); j++){


               if (i !=j && text.charAt(i)==text.charAt(j)){ // if (text.charAt(i)==text.charAt(j)){  result +=text.charAt(i)+"";  }
                   isUnique= false;
                   break;
               }

           }

           if (isUnique){  // if(!result.contains(text.charAt(i))){   sout(text.charAt(i) }
               System.out.print(text.charAt(i)+" ");
           }
       }

    }
}
