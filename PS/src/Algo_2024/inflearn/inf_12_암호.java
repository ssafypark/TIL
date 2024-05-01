package Algo_2024.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_12_암호 {
    public static String solution(int n, String str) {
        String answer = "";
        int num = 0;
        for (int i = 0; i < n; i++) {
            String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            num = Integer.parseInt(temp, 2); // 문자열을 2진수로 변환
            answer += (char) num;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        System.out.println(solution(n, str));
    }
}
