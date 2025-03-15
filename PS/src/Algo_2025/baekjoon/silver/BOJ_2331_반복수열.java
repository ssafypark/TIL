package Algo_2025.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_2331_반복수열 {

    private static String A;
    private static int P;
    private static int cnt;
    private static boolean flag = true;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        A = st.nextToken();
        P = Integer.parseInt(st.nextToken());
        map.put(Integer.parseInt(A), 1);
        while (flag) {
            int temp = 0;
            for (int i = 0; i < A.length(); i++) {
                int num = 1;
                for (int j = 0; j < P; j++) {
                    num *= A.charAt(i) - '0';
                }
                temp += num;
            }
            A = String.valueOf(temp);
            map.put(temp, map.getOrDefault(temp, 0) + 1);
            if (map.get(temp) == 3) {
                flag = false;
            }
        }
        for (int x : map.keySet()) {
            if (map.get(x) == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
