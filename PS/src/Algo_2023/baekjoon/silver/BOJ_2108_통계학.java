package Algo_2023.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2108_통계학 {

    private static int N;
    private static double sum;
    private static int idx;
    private static int mapMax = Integer.MIN_VALUE;
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Arrays.sort(arr);
        if (N % 2 == 0) {
            idx  = N / 2 - 1;
        } else {
            idx = N / 2;
        }
        for (int key : map.values()) {
            mapMax = Math.max(mapMax, key);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == mapMax) {
                list.add(key);
            }
        }
        Collections.sort(list);
        if (list.size() >= 2) {
            mapMax = list.get(1);
        } else {
            mapMax = list.get(0);
        }
        sb.append(Math.round(sum / N)).append('\n').append(arr[idx]).append('\n').append(mapMax).append('\n').append(max - min).append('\n');
        System.out.println(sb);
    }
}
