package Algo_2023.swea.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2068_최대수구하기 {

    private static int T;
    private static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());
        for (int tc = 1; tc <= T; tc++) {
            max = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 10; i++) {
                max = Math.max(max, Integer.parseInt(st.nextToken()));
            }
            System.out.printf("#%d %d\n", tc, max);
        }
    }
}
