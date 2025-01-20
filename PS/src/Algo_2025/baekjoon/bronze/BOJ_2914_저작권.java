package Algo_2025.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2914_저작권 {

    private static int A;
    private static int I;
    private static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        I = Integer.parseInt(st.nextToken());
        answer = A * (I - 1) + 1;
        System.out.println(answer);
    }
}
