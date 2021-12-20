package day10_18;

import java.util.ArrayList;
import java.util.Arrays;

public class InnerOuter {
    public static void main(String[] args) {

        int[] outer = {1, 2, 4, 6};
        int[] inner = {2, 4};

        Arrays.sort(outer);
        Arrays.sort(inner);

        int counterFound = 0;
        for (int eachInner : inner) {
            for (int eachOuter : outer) {
                if (eachInner == eachOuter) {
                    counterFound++;
                    break;
                }
            }
        }
        System.out.println(counterFound == inner.length);
    }


}

