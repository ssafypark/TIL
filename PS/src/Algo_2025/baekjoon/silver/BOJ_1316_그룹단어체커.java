package Algo_2025.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1316_그룹단어체커 {

    private static int N;
    private static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < N; tc++) {
            String str = br.readLine();
            int[] arr = new int[26];
            arr[str.charAt(0) - 'a'] = 1;
            boolean flag = true;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(i - 1) && arr[str.charAt(i) - 'a'] == 1) {
                    flag = false;
                    break;
                }
                if (str.charAt(i) != str.charAt(i - 1)) {
                    arr[str.charAt(i) - 'a'] = 1;
                }
            }
            if (flag) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
