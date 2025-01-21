package Algo_2025.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10988_팰린드롬인지확인하기 {

    private static String str;
    private static String reverse;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        reverse = new StringBuilder(str).reverse().toString();
        if (str.equals(reverse)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
