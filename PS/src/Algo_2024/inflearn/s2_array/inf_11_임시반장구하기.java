package Algo_2024.inflearn.s2_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_11_임시반장구하기 {

    private static int N;
    private static int max = Integer.MIN_VALUE;
    private static int[][] arr;

    public static int solution(int[][] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    for (int k = 0; k < 5; k++) {
                        if (arr[i][k] == arr[j][k]) {
                            cnt++;
                            break;
                        }
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][5];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(arr));
    }
}
