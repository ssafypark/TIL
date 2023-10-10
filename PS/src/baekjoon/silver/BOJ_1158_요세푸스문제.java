package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_1158_요세푸스문제 {

    private static int N;
    private static int K;
    private static int idx;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(i + 1);
        }
        delete(list);
    }

    private static void delete(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        while (!list.isEmpty()) {
            idx = idx + K - 1;
        }
    }
}
