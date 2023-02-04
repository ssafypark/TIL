package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1929_소수구하기 {

    private static int M;
    private static int N;
    private static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        check = new boolean[N + 1];
        check[0] = true;
        check[1] = true;
        for (int i = 2; i <= N; i++) {
            for (int j = i * 2; j <= N; j += i) {
                check[j] = true;
            }
        }
        for (int i = M; i <= N; i++) {
            if (!check[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
