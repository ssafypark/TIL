package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1253_좋다 {

    private static int N;
    private static int find;
    private static int startIndex;
    private static int endIndex;
    private static int cnt;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            find = arr[i];
            startIndex = 0;
            endIndex = N - 1;
            while (startIndex < endIndex) {
                if (arr[startIndex] + arr[endIndex] == find) {
                    if (startIndex != i && endIndex != i) {
                        cnt++;
                        break;
                    } else if (startIndex == i) {
                        startIndex++;
                    } else if (endIndex == i) {
                        endIndex--;
                    }
                } else if (arr[startIndex] + arr[endIndex] < find) {
                    startIndex++;
                } else {
                    endIndex--;
                }
            }
        }
        System.out.println(cnt);
    }
}
