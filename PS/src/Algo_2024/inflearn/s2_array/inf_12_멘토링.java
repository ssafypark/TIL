package Algo_2024.inflearn.s2_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_12_멘토링 {

    private static int N;
    private static int M;
    private static int[][] arr;

    public static int solution() {
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int cnt = 0;
                int iRank = 0;
                int jRank = 0;
                for (int a = 0; a < M; a++) {
                    for (int b = 0; b < N; b++) {
                        if (arr[a][b] == i) {
                            iRank = b;
                        }
                        if (arr[a][b] == j) {
                            jRank = b;
                        }
                    }
                    if (iRank < jRank) {
                        cnt++;
                    }
                }
                if (cnt == M) {
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
        arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution());
    }
}
