package Algo_2024.inflearn.Prac.s4_HashMap_TreeSet_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class inf_01_학급회장 {

    private static int N;
    private static int max;
    private static String str;

    public static char solution(int N, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        max = Integer.MIN_VALUE;
        for (char x : map.keySet()) {
            if (map.get(x) > max) {
                max = map.get(x);
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        str =  br.readLine();
        System.out.println(solution(N, str));
    }
}
