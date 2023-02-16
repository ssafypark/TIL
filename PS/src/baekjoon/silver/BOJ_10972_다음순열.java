package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10972_다음순열 {

    private static int N;
    private static int index_i;
    private static int index_j;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if (nextPermutation(arr)) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
        } else {
            sb.append("-1");
        }
        System.out.println(sb);
    }

    private static boolean nextPermutation(int[] arr) {
        index_i = arr.length - 1;
        while (index_i > 0 && arr[index_i - 1] > arr[index_i]) {
            index_i--;
        }
        if (index_i == 0) {
            return false;
        }
        index_j = arr.length - 1;
        while (arr[index_i - 1] > arr[index_j]) {
            index_j--;
        }
        swap(index_i - 1, index_j);
        index_j = arr.length - 1;
        while (index_i < index_j) {
            swap(index_i, index_j);
            index_i++;
            index_j--;
        }
        return true;
    }

    private static void swap(int index_i, int index_j) {
        int temp = arr[index_i];
        arr[index_i] = arr[index_j];
        arr[index_j] = temp;
    }
}
