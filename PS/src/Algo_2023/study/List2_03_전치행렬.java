package Algo_2023.study;

import java.util.Arrays;

public class List2_03_전치행렬 {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int N = 3;
        System.out.println("원래의 모습");
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println();

        // 전치행렬
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i < j) {
                    // swap 하는 부분
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        System.out.println("전치행렬 모습");
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println();

        // 전치행렬
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                    // swap 하는 부분
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
            }
        }
        System.out.println("전치행렬 모습");
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println();
    }
}
