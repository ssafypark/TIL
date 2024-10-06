package Algo_2024.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_03_최대점수구하기_DFS {

    private static int N;
    private static int M;
    private static int answer;
    private static int[] score;
    private static int[] time;

    public static void DFS(int L, int sumScore, int sumTime, int[] score, int[] time) {
        if (M < sumTime) {
            return;
        }
        if (L == N) {
            answer = Math.max(answer, sumScore);
        } else {
            DFS(L + 1, sumScore + score[L], sumTime + time[L], score, time);
            DFS(L + 1, sumScore, sumTime, score, time);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        score = new int[N];
        time = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            score[i] = Integer.parseInt(st.nextToken());
            time[i] = Integer.parseInt(st.nextToken());
        }
        DFS(0, 0 ,0, score, time);
        System.out.println(answer);
    }
}
