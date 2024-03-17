package Algo_2023.baekjoon.bronze;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_1152_단어의개수_StringTokenizer {

    private static String str;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());
    }
}
