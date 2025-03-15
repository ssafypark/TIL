package Algo_2025.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_26069_붙임성좋은총총이 {

    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        N = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < N; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String p1 = st.nextToken();
            String p2 = st.nextToken();
            if (p1.equals("ChongChong") || p2.equals("ChongChong")) {
                map.put(p1, 1);
                map.put(p2, 1);
            } else if (map.containsKey(p1) || map.containsKey(p2)) {
                map.put(p1, 1);
                map.put(p2, 1);
            }
        }
        System.out.println(map.size());
    }
}
