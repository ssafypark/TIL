package Algo_2023.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10101_삼각형외우기 {

    private static int a;
    private static int b;
    private static int c;
    private static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        sum = a + b + c;
        if (a == 60 && b == 60 && c == 60) {
            System.out.println("Equilateral");
        } else if (sum == 180 && (a == b || b == c || a == c)) {
            System.out.println("Isosceles");
        } else if (sum == 180 && (a != b || b != c || a != c)) {
            System.out.println("Scalene");
        } else {
            System.out.println("Error");
        }
    }
}
