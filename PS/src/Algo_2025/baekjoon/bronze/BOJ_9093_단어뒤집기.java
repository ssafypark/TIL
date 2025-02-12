package Algo_2025.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9093_단어뒤집기 {

    private static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int value = st.countTokens();
            for (int j = 0; j < value; j++) {
                StringBuilder sb = new StringBuilder(st.nextToken()).reverse();
                System.out.print(sb + " ");
            }
            System.out.println();
        }
    }
}
