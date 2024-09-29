package Algo_2024.inflearn.s1_string_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class inf_04_단어뒤집기 {

    private static int N;
    private static String[] strs;

    public static ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            StringBuilder sb = new StringBuilder(strs[i]);
            answer.add(sb.reverse().toString());
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        strs = new String[N];
        for (int i = 0; i < N; i++) {
            strs[i] = br.readLine();
        }
        for (String x : solution(strs)) {
            System.out.println(x);
        }
    }
}
