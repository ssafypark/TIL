package Algo_2023.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1213_팰린드롬만들기 {

    private static String str;
    private static int center;
    private static int cnt;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        str = br.readLine();
        arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 65]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                center = i;
                cnt++;
            }
        }
        if (cnt > 1 || (cnt == 1 && str.length() % 2 == 0)) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i] / 2; j++) {
                sb.append((char) (i + 65));
            }
        }
        StringBuilder temp = new StringBuilder(sb);
        if (cnt == 1) {
            sb.append((char) (center + 65));
        }
        System.out.println(sb.toString() + temp.reverse());
    }
}
