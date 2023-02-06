package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1764_듣보잡 {

    private static int N;
    private static int M;
    private static int cnt;
    private static String temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N + M; i++) {
            temp = br.readLine();
            map.put(temp, map.getOrDefault(temp,0) + 1);
            if (map.get(temp) == 2) {
                cnt++;
            }
        }
        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        System.out.println(cnt);
        for (String key : keySet) {
            if (map.get(key) == 2) {
                System.out.println(key);
            }
        }
    }
}
