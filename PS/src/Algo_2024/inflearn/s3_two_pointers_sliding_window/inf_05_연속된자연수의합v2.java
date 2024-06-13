package Algo_2024.inflearn.s3_two_pointers_sliding_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_05_연속된자연수의합v2 {

    private static int N;
    private static int lt;
    private static int sum;
    private static int[] arr;

    public static int solution(int M, int[] arr) {
        int answer = 0;
        for (int rt = 0; rt < M; rt++) {
            sum += arr[rt];
            if (sum == N) {
                answer++;
            }
            while (sum >= N) {
                sum -= arr[lt++];
                if (sum == N) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        // 연속 된 숫자이니 절반까지만 더해주면 됨
        int M = N / 2 + 1;
        arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = i + 1;
        }
        System.out.println(solution(M, arr));
    }
}
