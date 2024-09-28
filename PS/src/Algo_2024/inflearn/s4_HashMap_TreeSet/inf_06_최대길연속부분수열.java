package Algo_2024.inflearn.s4_HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 입력값
* 14 2
* 1 1 0 0 1 1 0 1 1 0 1 1 0 1
*
* 출력값
* 8
*
* */
public class inf_06_최대길연속부분수열 {

    private static int N;
    private static int K;
    private static int[] arr;

    public static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int cnt = 0;
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                cnt++;
                while (cnt > k) {
                    if (arr[lt] == 0) {
                        cnt--;
                    }
                    lt++;
                }
            }
            answer = Math.max(answer, rt - lt + 1);
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
        System.out.println(solution(N, K, arr));
    }
}
