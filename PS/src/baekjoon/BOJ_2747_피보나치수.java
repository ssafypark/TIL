package baekjoon;

import java.util.Scanner;

public class BOJ_2747_피보나치수 {

    private static int n;
    private static int A;
    private static int B;
    private static int C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        B = 1;

        if (n == 1) {
            System.out.println(1);
        } else {

            for (int i = 1; i < n; i++) {
                C = A + B;
                A = B;
                B = C;
            }
            System.out.println(C);
        }
    }
}
