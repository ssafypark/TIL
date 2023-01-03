package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2908_상수 {

    private static int A;
    private static int B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        System.out.println(A > B ? A : B);
    }
}
