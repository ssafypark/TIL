package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2343_기타레슨 {

    private static int N;
    private static int M;
    private static int start;
    private static int end;
    private static int midValue;
    private static int sum;
    private static int cnt;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (start < arr[i]) {
                start = arr[i];
            }
            end += arr[i];
        }
        while (start <= end) {
            midValue = (start + end) / 2;
            sum = 0;
            cnt = 0;
            for (int i = 0; i < N; i++) {
                if (sum + arr[i] > midValue) {
                    cnt++;
                    sum = 0;
                }
                sum += arr[i];
            }
            if (sum != 0) {
                cnt++;
            }
            if (cnt > M) {
                start = midValue + 1;
            } else {
                end = midValue - 1;
            }
        }
        System.out.println(start);
    }
}
