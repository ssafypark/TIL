package Algo_2024.inflearn.s3_two_pointers_sliding_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_03_최대매출 {

    private static int N;
    private static int K;
    private static int[] arr;

    public static int solution(int[] arr) {
        int answer = 0;
        int sum = 0;
        // 첫 연속된 윈도우 값을 넣어줌
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }
        answer = sum;
        // 슬라이딩 윈도우
        for (int i = K; i < N; i++) {
            sum = sum + arr[i] - arr[i - K];
            answer = Math.max(sum, answer);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(arr));
    }
}
