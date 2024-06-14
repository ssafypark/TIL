package Algo_2024.inflearn.s4_HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class inf_01_학급회장 {

    private static int N;
    private static int max = Integer.MIN_VALUE;
    private static String str;

    public static char solution(int N, String str) {
        char answer = ' ';
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char x : str.toCharArray()) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }
        for (char key : hashMap.keySet()) {
            if (hashMap.get(key) > max) {
                max = hashMap.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        str = br.readLine();
        System.out.println(solution(N, str));
    }
}
