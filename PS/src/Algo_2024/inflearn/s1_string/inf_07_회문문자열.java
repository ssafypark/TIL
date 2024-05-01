package Algo_2024.inflearn.s1_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_07_회문문자열 {
    public static String solution(String str) {
        String answer = "NO";
        String temp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(temp)) {
            return "YES";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }
}
