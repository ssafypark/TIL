package Algo_2024.inflearn.s3_two_pointers_sliding_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_05_연속된자연수의합 {

    private static int N;
    private static int lt;
    private static int sum;
    private static int[] arr;

    public static int solution(int[] arr) {
        int answer = 0;
        sum = arr[0];
        for (int rt = 1; rt < N; rt++) {
            sum += arr[rt];
            if (sum == N) {
                answer++;
            }
            while (sum >= N) {
                sum -= arr[lt++];
                if (lt != rt && sum == N) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        System.out.println(solution(arr));
    }
}
