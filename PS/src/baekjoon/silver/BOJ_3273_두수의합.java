package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_3273_두수의합 {

    private static int n;
    private static int x;
    private static int cnt;
    private static int start;
    private static int end;
    private static int sum;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 1 2 3 5 7 9 10 11 12
        x = Integer.parseInt(br.readLine());
        end = n - 1;
        while (start < end) {
            sum = arr[start] + arr[end];
            if (sum == x) {
                cnt++;
            }
            if (sum <= x) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(cnt);
    }
}
