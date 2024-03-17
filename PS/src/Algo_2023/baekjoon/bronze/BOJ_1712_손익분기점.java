package Algo_2023.baekjoon.bronze;

import java.util.Scanner;

public class BOJ_1712_손익분기점 {

    private static int A;
    private static int B;
    private static int C;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();

        if (C <= B) {
            System.out.println("-1");
        } else {
            System.out.println((A / ( C - B )) + 1);
        }
    }
}
