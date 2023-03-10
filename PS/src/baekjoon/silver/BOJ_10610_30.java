package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10610_30 {

    private static String N;
    private static int num;
    private static int sum;
    private static char[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = br.readLine();
        arr = new char[N.length()];
        for (int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i);
        }
        Arrays.sort(arr);
        for (int i = N.length() - 1; i >= 0; i--) {
            num = arr[i] - '0';
            sum += num;
            sb.append(num);
        }
        if (arr[0] != '0' || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(sb);
    }
}
