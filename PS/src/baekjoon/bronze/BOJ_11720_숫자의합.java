package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720_숫자의합 {

    private static int N;
    private static int num;
    private static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());
        str = bf.readLine();

        for (int i = 0; i < N; i++) {
            num += str.charAt(i) - 48;
        }
        System.out.println(num);
    }
}
