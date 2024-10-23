package Algo_2024.inflearn.s5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class inf_07_교육과정설계 {

    private static String str1;
    private static String str2;

    public static String solution(String str1, String str2) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str1.length(); i++) {
            queue.add(str1.charAt(i));
        }
        for (char x : str2.toCharArray()) {
            if (queue.contains(x)) {
                if (queue.poll() != x) {
                    return "NO";
                }
            }
        }
        if (!queue.isEmpty()) {
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str1 = br.readLine();
        str2 = br.readLine();
        System.out.println(solution(str1, str2));
    }
}
