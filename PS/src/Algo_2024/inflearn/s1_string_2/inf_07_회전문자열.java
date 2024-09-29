package Algo_2024.inflearn.s1_string_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_07_회전문자열 {

    private static String str;

    public static String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        System.out.println(solution(str));
    }
}
