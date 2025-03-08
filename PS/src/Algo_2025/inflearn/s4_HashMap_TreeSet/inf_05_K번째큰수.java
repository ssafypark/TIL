package Algo_2025.inflearn.s4_HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class inf_05_K번째큰수 {

    private static int N;
    private static int K;
    private static int cnt;
    private static int[] arr;

    public static int solution() {
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        int answer = -1;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    treeSet.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }
        for (int x : treeSet) {
            cnt++;
            if (cnt == K) {
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution());
    }
}
