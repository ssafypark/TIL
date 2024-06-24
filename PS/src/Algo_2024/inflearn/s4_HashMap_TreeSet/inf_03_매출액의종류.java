package Algo_2024.inflearn.s4_HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class inf_03_매출액의종류 {

    private static int N;
    private static int K;
    private static int[] arr;

    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i  = 0; i < K - 1; i++) {  // 0, 1, 2 순번 까지는 미리 셋팅
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = K - 1; rt < N; rt++) {
            hashMap.put(arr[rt], hashMap.getOrDefault(arr[rt], 0) + 1);
            answer.add(hashMap.size());
            hashMap.put(arr[lt], hashMap.get(arr[lt]) - 1);
            if (hashMap.get(arr[lt]) == 0) {
                hashMap.remove(arr[lt]);
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int x : solution(arr)) {
            System.out.print(x + " ");
        }
    }
}
