package day09_02;

public class CombinationLetter {
    public static void main(String[] args) {

//        for (char i = 'Z'; i <= 'V'; i++){
//            System.out.print( " "+i);
//            for (char j='z'; j<='v'; j--){
//                System.out.println(""+i+j);
//            }
//
//        }
//
//        char x='A';
//        x+=1;
//        System.out.println(x);


char[] arr={'z','y','x','w','v'};

for (int i=0; i<5; i++){
    for (int j=0; j<5;j++){
        System.out.print(arr[i]);
        System.out.println(arr[j]);
    }
}
        System.out.println("========================================");
String str="zyxwv";

for (int i=0; i<5; i++ ){
    for (int j=0; j<5; j++){

        System.out.print(str.charAt(i));
        System.out.println(str.charAt(j));
    }
}












    }
}
