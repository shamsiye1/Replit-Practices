package day09_01;

public class Zoombie1 {
    public static void main(String[] args) {

        int habitants=100;
        int i=0;
        while ( habitants>=1){

            System.out.println("Day "+ i + " ["+ habitants+"]");
            i++;
            habitants  = habitants/2;
        }

        System.out.println("---- EXTINCT ----");

//        Scanner scan = new Scanner(System.in);
//        int inhabitants = scan.nextInt();
//
//        for (int i=0; i >= 0 ; i++){
//
//            if(inhabitants < 1)
//                break;
//
//            System.out.println("Day "+ i + " ["+ inhabitants+"]");
//
//            inhabitants  = inhabitants/2;
//        }
//        System.out.println("---- EXTINCT ----");
//

        String name = "abxyabcab";
        int n =3;
        String suffix = name.substring(0,n);
        String remaining = name.substring(n, name.length());

        if (remaining.contains(suffix)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }












    }
}
