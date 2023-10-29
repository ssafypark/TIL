package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5086_배수와약수 {

    private static int N;
    private static int M;
    private static int temp;
    private static boolean flag = true;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            if (N == 0 && M == 0) {
                break;
            }
            if (N < M) {
                temp = N;
                while (temp < M) {
                    temp += N;
                    if (temp == M) {
                        System.out.println("factor");
                        break;
                    }
                }
            } else if (N > M) {
                temp = M;
                while (N > temp) {
                    temp += M;
                    if (temp == N) {
                        System.out.println("multiple");
                        break;
                    } else if (N < temp) {
                        System.out.println("neither");
                        break;
                    }
                }
            }
        }
    }
}
