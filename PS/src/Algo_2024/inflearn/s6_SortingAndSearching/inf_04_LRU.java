package Algo_2024.inflearn.s6_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_04_LRU {

    private static int S;
    private static int N;
    private static int[] arr;
    private static int[] cache;


    public static int[] solution(int S, int N, int[] arr) {
        cache = new int[S];
        for (int x : arr) {
            int idx = -1;
            for (int i = 0; i < S; i++) {
                if (x == cache[i]) { // hit 체크
                    idx = i;
                }
            }
            if (idx == -1) { // miss 일때
                for (int i = S - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            } else { // hit 일때
                for (int i = idx; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
        }
        return cache;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int x : solution(S, N, arr)) {
            System.out.print(x + " ");
        }
    }
}
