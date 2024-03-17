package Algo_2023.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11721_열개씩끊어출력하기 {

    private static String str;
    private static int num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        str = br.readLine();
        if (str.length() % 10 > 0) {
            num = str.length() / 10 + 1;
        } else {
            num = str.length() / 10;
        }
        for (int i = 0; i < num ; i++) {
            for (int j = 0; j < 10; j++) {
                if (str.length() > i * 10 + j) {
                    if (i == 0) {
                        sb.append(str.charAt(j));
                    } else {
                        sb.append(str.charAt(i * 10 + j));
                    }
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
