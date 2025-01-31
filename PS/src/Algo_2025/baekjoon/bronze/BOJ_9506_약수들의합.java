package Algo_2025.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_9506_약수들의합 {

    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            ArrayList<Integer> list = new ArrayList<>();
            n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            int sum = 0;
            for (int i = 1; i <= n/2; i++) {
                if (n % i == 0) {
                    sum += i;
                    list.add(i);
                }
            }
            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < list.size() - 1; i++) {
                    System.out.print(list.get(i) + " + ");
                }
                System.out.print(list.get(list.size() - 1));
            } else {
                System.out.print(n + " is NOT perfect.");
            }
            System.out.println();
        }
    }
}
