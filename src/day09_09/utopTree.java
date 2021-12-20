package day09_09;

public class utopTree {
    public static void main(String[] args) {

        int treeSize = 0;
        for (int year = 1; year <= 10; year++) {

            if (year <= 3) {

                treeSize++;
                System.out.println("year " + year + " - growth 1 cm\ntree size: " + treeSize + "cm");


            } else {
                treeSize += 2;
                System.out.println("year " + year + " - growth 2 cm\ntree size: " + treeSize + "cm");
            }


        }


    }


}

