package Algo_2024.inflearn.s1_string_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_01_문자찾기2 {

    private static String str;
    private static char check;

    public static int solution(String str, char check) {
        int answer = 0;
        str = str.toUpperCase();
        check = Character.toUpperCase(check);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == check) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        check = br.readLine().charAt(0);
        System.out.println(solution(str, check));
    }
}
