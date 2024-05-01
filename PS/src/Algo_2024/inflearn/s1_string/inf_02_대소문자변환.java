package Algo_2024.inflearn.s1_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
    [ ASCII Code ]
    총 25개의 문자
    대문자 : 65 ~ 90
    소문자 : 97 ~ 122

    대문자와 소문자의 차이는 32의 차인
 */
public class inf_02_대소문자변환 {
    public static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                answer += (char) (str.charAt(i) - 32);
            } else {
                answer += (char) (str.charAt(i) + 32);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }

}
