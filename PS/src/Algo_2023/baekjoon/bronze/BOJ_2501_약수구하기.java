package Algo_2023.baekjoon.bronze;

import java.io.*;
import java.util.*;

public class BOJ_2501_약수구하기 {

    private static int N;
    private static int K;
    private static int[] arr;
    private static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= N; i++) {
            if (N%i == 0) {
                set.add(N/i);
            }
        }
        if (set.size() < K) {
            System.out.println(0);
            return;
        }
        arr = new int[set.size()];
        Iterator<Integer> iter = set.iterator();
        int i = 0;
        while(iter.hasNext()) {
            arr[i] = iter.next();
            i++;
        }
        Arrays.sort(arr);
        System.out.println(arr[K-1]);
    }
}
