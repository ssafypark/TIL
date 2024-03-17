package Algo_2023.programmers;

import java.util.Arrays;

public class Test {

    private static int[] temp;

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};

        temp = Arrays.copyOfRange(array, 1, 5);
        Arrays.sort(temp);

    }
}
