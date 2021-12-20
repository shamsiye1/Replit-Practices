package day10_05;

public class printUniqueWord {

    public static void main(String[] args) {

        String[] words={"c++", "code", "c++", "c#"};

        String result="";

        for (int j=0; j<words.length; j++){
           // boolean isUnique=true;

            int count=0;
            for (int i=0; i<words.length; i++){

                if ( words[j].equals(words[i])){

                    count++;
                }
            }


            if (count==1 ){
                System.out.println(words[j]);
            }


        }




    }



}
