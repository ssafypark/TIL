package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1546_평균 {

    private static int N;
    private static double[] arr;
    private static double sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new double[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            sum += arr[i] / arr[N - 1] * 100;
        }
        System.out.println(sum / N);
    }
}
