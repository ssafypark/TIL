package Algo_2024.inflearn.s4_HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class inf_02_아나그램 {

    private static String str1;
    private static String str2;

    public static String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char x : str1.toCharArray()) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }
        for (char x : str2.toCharArray()) {
            if (!hashMap.containsKey(x) || hashMap.get(x) == 0) {
                return "NO";
            }
            hashMap.put(x, hashMap.get(x) - 1);
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
