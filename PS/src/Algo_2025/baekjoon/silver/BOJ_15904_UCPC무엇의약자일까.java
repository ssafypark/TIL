package Algo_2025.baekjoon.silver;

import java.io.*;

public class BOJ_15904_UCPC무엇의약자일까 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String target = "UCPC";
        int idx = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch) && ch == target.charAt(idx)) {
                idx++;
                if (idx == target.length()) {
                    System.out.println("I love UCPC");
                    return;
                }
            }
        }
        System.out.println("I hate UCPC");
    }
}