package Algo_2023.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5585_거스름돈 {

    private static int price;
    private static int change;
    private static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        price = Integer.parseInt(bf.readLine());
        change = 1000 - price;

        while (change != 0) {
            if (change / 500 > 0) {
                change -= 500;
                cnt++;
            } else if (change / 100 > 0) {
                change -= 100;
                cnt++;
            } else if (change / 50 > 0) {
                change -= 50;
                cnt++;
            } else if (change / 10 > 0) {
                change -= 10;
                cnt++;
            } else if (change / 5 > 0) {
                change -= 5;
                cnt++;
            } else {
                change -= 1;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
