package Algo_2024.inflearn.s1_string_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_02_대소문자변환 {

    private static String str;

    public static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97) {
                answer += (char) (str.charAt(i) - 32);
            } else {
                answer += (char) (str.charAt(i) + 32);
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
