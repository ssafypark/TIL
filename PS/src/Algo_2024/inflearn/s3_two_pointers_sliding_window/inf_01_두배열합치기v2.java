package Algo_2024.inflearn.s3_two_pointers_sliding_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class inf_01_두배열합치기v2 {

    private static int N;
    private static int M;
    private static int[] arr1;
    private static int[] arr2;

    public static ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int point1 = 0;
        int point2 = 0;
        while (point1 < n && point2 < m) {
            if (arr1[point1] < arr2[point2]) {
                answer.add(arr1[point1++]);
            } else {
                answer.add(arr2[point2++]);
            }
        }
        while (point1 < n) {
            answer.add(arr1[point1++]);
        }
        while (point2 < m) {
            answer.add(arr2[point2++]);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr1 = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        M = Integer.parseInt(br.readLine());
        arr2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        for (int x : solution(N, M, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
}
