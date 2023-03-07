package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4948_베르트랑공준 {

    private static int n;
    private static int cnt;
    private static boolean[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        arr = new boolean[246913];
        isPrime();
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            cnt = 0;
            for (int i = n + 1; i <= n * 2; i++) {
                if (!arr[i]) {
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }

    private static void isPrime() {
        arr[0] = true; // 소수가 아닌 경우 true
        arr[1] = true;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) {
                continue;
            }
            for (int j = i * 2; j < arr.length; j += i) {
                arr[j] = true;
            }
        }
    }
}
