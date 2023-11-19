package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2744_대소문자바꾸기 {

    private static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if('A' <= ch && ch <= 'Z') {
                System.out.print((char)('a' + ch - 'A'));
            } else {
                System.out.print((char)('A' + ch - 'a'));
            }
        }
    }
}
