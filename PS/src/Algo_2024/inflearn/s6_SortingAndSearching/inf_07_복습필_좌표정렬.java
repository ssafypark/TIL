package Algo_2024.inflearn.s6_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
* 1차원 배열에서 내림차순(숫자, 문자 가능)
* Arrays.sort(arr, Collections.reverseOrder());
* */
public class inf_07_복습필_좌표정렬 {

    private static int N;
    private static int[][] arr;

    public static int[][] solution(int[][] arr) {
        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
                // return Integer.compare(b[1], a[1]); // 내림차순
            } else {
                return Integer.compare(a[0], b[0]);
                // return Integer.compare(b[0], a[0]); // 내림차순
            }
        });
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        for (int[] x : solution(arr)) {
            System.out.println(x[0] + " " + x[1]);
        }
    }
}