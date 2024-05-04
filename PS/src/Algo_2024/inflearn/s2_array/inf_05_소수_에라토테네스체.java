package Algo_2024.inflearn.s2_array;

import java.io.*;

public class inf_05_소수_에라토테네스체 {

    private static int N;

    public static int solution(int N) {
        int answer = 0;
        int[] check = new int[N + 1]; // N번 인덱스까지 체크하기 위해
        // 0하고 1은 소수가 아니기 때문에 볼필요가 없음
        for (int i = 2; i <= N; i++) {
            if (check[i] == 0) {
                answer++;
                for (int j = i; j < N + 1; j += i) {
                    check[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        System.out.println(solution(N));
    }
}
