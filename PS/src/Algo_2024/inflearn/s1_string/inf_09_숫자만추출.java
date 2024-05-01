package Algo_2024.inflearn.s1_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_09_숫자만추출 {

    public static int solution(String s) {
        String answer = "";
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}
