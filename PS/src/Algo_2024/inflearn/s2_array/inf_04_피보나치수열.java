package Algo_2024.inflearn.s2_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_04_피보나치수열 {

    private static int N;

    public static int[] solution(int N) {
        int[] answer = new int[N];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < N; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for (int x : solution(N)) {
            System.out.print(x + " ");
        }
    }
}
