package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9086_문자열 {

    private static int T;
    private static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            str = br.readLine();
            System.out.print(str.charAt(0));
            System.out.println(str.charAt(str.length() - 1));
        }
    }
}
