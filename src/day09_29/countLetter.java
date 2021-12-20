package day09_29;

public class countLetter {
//
//    public static void main(String[] args) {
//        String name = "opendoor";
//        String result = "";
//        for (int i = 0; i < name.length(); i++) {
//            int count = 1;
//            for (int j = i+1; j < name.length(); j++) {
//                if(name.charAt(i) == name.charAt(j) ){
//                    count++;
//                }
//            }
//            //if(!result.contains(name.charAt(i) +"")) {
//                result = result + "" + count + name.charAt(i);
//            //}
//        }
//        System.out.println(result);
//    }

    public static void main(String[] args) {

        String word = "appleeeyss"; // 1a2p1l3e1y2s

        String holdWord = "";


        for (int i = 0; i < word.length(); i++) {

            int counter = 1;

            for (int j = i + 1; j < word.length(); j++) {

                if (word.charAt(i) == word.charAt(j)) {

                    counter++;
                }

            }

            if (!holdWord.contains(word.charAt(i) + "")) {

                holdWord += "" + counter + word.charAt(i);
        }

        }

        System.out.println(holdWord);
    }


}





































































