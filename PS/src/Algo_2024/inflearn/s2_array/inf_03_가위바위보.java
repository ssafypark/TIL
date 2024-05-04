package Algo_2024.inflearn.s2_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_03_가위바위보 {

    private static int N;
    private static int[] A;
    private static int[] B;

    public static String solution(int[] A, int[] B) {
        String answer = "";
        for (int i = 0; i < N; i++) {
            if (A[i] == B[i]) {
                answer += "D";
            } else if (A[i] == 1 && B[i] == 3) {
                answer += "A";
            } else if (A[i] == 2 && B[i] == 1) {
                answer += "A";
            } else if (A[i] == 3 && B[i] == 2) {
                answer += "A";
            } else {
                answer += "B";
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        B = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        for (char x : solution(A, B).toCharArray()) {
            System.out.println(x);
        }
        System.out.println();
    }
}
