package Algo_2024.inflearn.s3_two_pointers_sliding_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class inf_01_두배열합치기 {

    private static int N;
    private static int M;
    private static ArrayList<Integer> arr = new ArrayList<>();

    public static int[] solution(int a, int b, ArrayList<Integer> arr) {
        int[] answer = new int[a + b];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        for (int x : solution(N, M, arr)) {
            System.out.print(x + " ");
        }
    }
}
