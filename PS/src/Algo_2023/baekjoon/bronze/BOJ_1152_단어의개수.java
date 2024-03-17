package Algo_2023.baekjoon.bronze;

import java.util.Scanner;

public class BOJ_1152_단어의개수 {

    private static String str;
    private static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                cnt++;
            }
        }

        if (str.charAt(0) == ' ' && str.charAt(str.length() - 1) == ' ') {
            System.out.println(cnt - 1);
        } else if (str.charAt(0) == ' ' || str.charAt(str.length() - 1) == ' ') {
            System.out.println(cnt);
        } else {
            System.out.println(cnt + 1);
        }
    }
}
