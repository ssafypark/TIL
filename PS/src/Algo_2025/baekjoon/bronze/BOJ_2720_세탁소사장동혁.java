package Algo_2025.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2720_세탁소사장동혁 {

    private static int T;
    private static int C;
    private static int Quarter = 0;
    private static int Dime = 0;
    private static int Nickel = 0;
    private static int Penny = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            C = Integer.parseInt(br.readLine());
            Quarter = C / 25;
            C = C % 25;
            Dime = C / 10;
            C = C % 10;
            Nickel = C / 5;
            C = C % 5;
            Penny = C / 1;
            System.out.println(Quarter + " " + Dime + " " + Nickel + " " + Penny);
        }
    }
}
