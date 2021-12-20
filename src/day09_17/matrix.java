package day09_17;

public class matrix {
    public static void main(String[] args) {
                 //        0      1       2
        int[][] matrix={{1,2,3},  //0
                        {4,5,6},  //1
                        {9,8,9}}; //2



        int lftDiagonal= matrix[0][0]+ matrix[1][1]+matrix[2][2];

       int rgtDiagonal= matrix[0][2]+matrix[1][1]+matrix[2][0];

       int result= rgtDiagonal-lftDiagonal;


        System.out.println(result);




















































    }
}
