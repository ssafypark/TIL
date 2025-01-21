package Algo_2025.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5565_영수증 {

    private static int total;
    private static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        total = Integer.parseInt(br.readLine());
        for (int i = 0; i < 9; i++) {
            sum += Integer.parseInt(br.readLine());
        }
        System.out.println(total - sum);
    }
}
