package Algo_2024.inflearn.s2_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_07_점수계산 {

    private static int N;
    private static int sum;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (arr[i - 1] != 0 && num != 0) {
                arr[i] += arr[i - 1] + num;
            } else {
                arr[i] = num;
            }
        }
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
