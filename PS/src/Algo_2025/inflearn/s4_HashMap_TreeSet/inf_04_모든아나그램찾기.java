package Algo_2025.inflearn.s4_HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class inf_04_모든아나그램찾기 {

    private static String S;
    private static String T;


    public static int solution() {
        int answer = 0;
        Map<Character, Integer> Smap = new HashMap<>();
        Map<Character, Integer> Tmap = new HashMap<>();
        for (char x : T.toCharArray()) {
            Tmap.put(x, Tmap.getOrDefault(x, 0) + 1);
        }
        for (int i = 0; i < S.length() - T.length() + 1; i++) {
            for (int j = 0; j < T.length(); j++) {
                Smap.put(S.charAt(i + j), Smap.getOrDefault(S.charAt(i + j), 0) + 1);
            }
            if (Tmap.equals(Smap)) {
                answer++;
            }
            Smap = new HashMap<>();
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();
        T = br.readLine();
        System.out.println(solution());
    }
}
