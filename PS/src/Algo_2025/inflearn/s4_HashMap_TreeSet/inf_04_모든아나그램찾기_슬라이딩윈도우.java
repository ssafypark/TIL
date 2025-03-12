package Algo_2025.inflearn.s4_HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class inf_04_모든아나그램찾기_슬라이딩윈도우 {

    private static String S;
    private static String T;


    public static int solution() {
        int answer = 0;
        Map<Character, Integer> Smap = new HashMap<>();
        Map<Character, Integer> Tmap = new HashMap<>();
        for (char x : T.toCharArray()) {
            Tmap.put(x, Tmap.getOrDefault(x, 0) + 1);
        }
        int L = T.length() - 1;
        for (int i = 0; i < L; i++) {
            Smap.put(S.charAt(i), Smap.getOrDefault(S.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = L; rt < S.length(); rt++) {
            Smap.put(S.charAt(rt), Smap.getOrDefault(S.charAt(rt), 0) + 1);
            if (Smap.equals(Tmap)) {
                answer++;
            }
            Smap.put(S.charAt(lt), Smap.get(S.charAt(lt)) - 1);
            if (Smap.get(S.charAt(lt)) == 0) {
                Smap.remove(S.charAt(lt));
            }
            lt++;
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
