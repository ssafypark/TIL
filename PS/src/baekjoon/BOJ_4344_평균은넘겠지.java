package baekjoon;

import java.util.Scanner;

public class BOJ_4344_평균은넘겠지 {

    private static int C;
    private static int N;
    private static int sum;
    private static int cnt;
    private static int[] arr;
    private static double[] avg;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        avg = new double[C];

        for (int i = 0; i < C; i++) {
            sum = 0;
            cnt = 0;
            N = sc.nextInt();
            arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            avg[i] = sum / N;
            for(int k = 0; k < N; k++) {
                if (avg[i] < arr[k]) {
                    cnt++;
                }
            }
            avg[i] = 100.000 / N * cnt;
        }

        for (int i = 0; i < C; i++) {
            System.out.printf("%.3f", avg[i]);
            System.out.println("%");
        }
    }
}
