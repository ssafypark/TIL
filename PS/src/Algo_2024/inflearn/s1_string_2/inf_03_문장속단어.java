package Algo_2024.inflearn.s1_string_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_03_문장속단어 {

    private static String str;

    public static String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] strs = str.split(" ");
        for (int i = 0; i < strs.length; i++) {
            if (max < strs[i].length()) {
                max = strs[i].length();
                answer = strs[i];
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
