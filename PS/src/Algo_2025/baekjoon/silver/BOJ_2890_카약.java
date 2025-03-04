package Algo_2025.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2890_카약 {

    private static int R;
    private static int C;
    private static int[] arr;
    private static int[] check;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new int[10];
        check = new int[C];
        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 1; j < C - 3; j++) {
                if (str.charAt(j) != '.') {
                    arr[str.charAt(j) - '0'] = j;
                    break;
                }
            }
        }
        for (int i = 1; i < 10; i++) {
            int cnt = 1;
            for (int j = 1; j < 10; j++) {
                if (i != j && arr[i] < arr[j] && check[arr[j]] != 1) {
                    check[arr[j]] = 1;
                    cnt++;
                }
            }
            check = new int[C];
            System.out.println(cnt);
        }
//        System.out.println("------------------------");
//        for (int i = 1 ; i < R; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
