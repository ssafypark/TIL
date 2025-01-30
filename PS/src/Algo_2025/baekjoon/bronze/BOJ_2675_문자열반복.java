package Algo_2025.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2675_문자열반복 {

    private static int T;
    private static int R;
    private static String S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st  = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            R = Integer.parseInt(st.nextToken());
            S = st.nextToken();
            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < R; j++) {
                    sb.append(S.charAt(i));
                }
            }
            System.out.println(sb);
        }
    }
}
