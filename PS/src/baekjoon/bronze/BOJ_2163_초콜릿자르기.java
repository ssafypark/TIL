package baekjoon.bronze;

import java.util.Scanner;

public class BOJ_2163_초콜릿자르기 {

    private static int N;
    private static int M;
    private static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        cnt = M * N - 1;
        System.out.println(cnt);
    }
}
