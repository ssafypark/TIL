package Algo_2023.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2609_최대공약수와최소공배수 {

    private static int n;
    private static int m;
    private static int a;
    private static int b;
    private static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        if (n == 0 && b == 0) {
            System.out.println(0);
            System.out.println(0);
        }
        max = Math.max(n, m);
        for (int i = 1; i <= max; i++) {
            if (n % i == 0 && m % i == 0) {
                list.add(i);
            }
        }
        System.out.println(list.get(list.size() - 1));
        a = m;
        b = n;
        while(true) {
            if (b > a) {
                a += m;
            } else if (b < a) {
                b += n;
            }
            if (a == b) {
                System.out.println(a);
                return;
            }
        }
    }
}
