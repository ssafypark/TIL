package Algo_2024.inflearn.Prac.s1_string_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_08_유효한팰린드롬 {

    private static String str;

    public static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                answer += Character.toUpperCase(str.charAt(i));
            }
        }
        String check = new StringBuilder(answer).reverse().toString();
        if (answer.equals(check)) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        System.out.println(solution(str));
    }
}
