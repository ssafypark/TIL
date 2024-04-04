package Algo_2023.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_3009_네번째점_Map {

    private static int key;
    private static Map<Integer, Integer> arrX;
    private static Map<Integer, Integer> arrY;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arrX = new HashMap<>();
        arrY = new HashMap<>();
        for (int i = 0 ; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            key = Integer.parseInt(st.nextToken());
            arrX.put(key, arrX.getOrDefault(key, 0) + 1);
            key = Integer.parseInt(st.nextToken());
            arrY.put(key, arrY.getOrDefault(key, 0) + 1);
        }
        for (int keyX : arrX.keySet()) {
            int value = arrX.get(keyX);
            if (value == 1) {
                System.out.print(keyX + " ");
            }
        }
        for (int keyY : arrY.keySet()) {
            int value = arrY.get(keyY);
            if (value == 1) {
                System.out.print(keyY);
            }
        }
    }
}
