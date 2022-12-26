package baekjoon;

import java.util.Scanner;

public class BOJ_1110_더하기사이클 {

    private static int N;
    private static int leftNum;
    private static int rightNum;
    private static int sum;
    private static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        if (N < 10) {
            N *= 10;
        }
        sum = N;

        while (true) {
            leftNum = sum / 10;
            rightNum = sum % 10;
            sum = leftNum + rightNum;

            sum = rightNum * 10 + sum % 10;
            cnt++;

            if (sum == N) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
