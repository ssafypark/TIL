package Algo_2024.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_03_문장속단어 {

    public static String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] strs = str.split(" ");
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() > max) {
                max = strs[i].length();
                answer = strs[i];
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
