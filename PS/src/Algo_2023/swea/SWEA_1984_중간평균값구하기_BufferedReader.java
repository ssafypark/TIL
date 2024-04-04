package Algo_2023.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_1984_중간평균값구하기_BufferedReader {

    private static int T;
    private static int TC = 0;
    private static double avg = 0;
    private static int[] arr = new int[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        while(TC++ < T) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
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
