package swea;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1984_중간평균값구하기 {

    private static int T;
    private static int TC = 0;
    private static double avg = 0;
    private static int[] arr = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        while(TC++ < T) {

            for(int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int sum = 0;
            for(int i = 1; i < 9; i++) {
                sum += arr[i];
            }

            avg = Math.round(sum / 8.0);

            System.out.printf("#%d %.0f \n", TC, avg);
        }
    }
}
