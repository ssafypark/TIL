package Algo_2024.inflearn.s3_two_pointers_sliding_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_04_연속부분수열v2 {

    private static int N;
    private static int M;
    private static int lt;
    private static int sum;
    private static int[] arr;

    public static int solution(int[] arr) {
        int answer = 0;
        for (int rt = 0; rt < N; rt++) {
            sum += arr[rt];
            if (sum == M) {
                answer++;
            }
            while (sum >= M) {
                sum -= arr[lt++];
                if (sum == M) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(arr));
    }
}
