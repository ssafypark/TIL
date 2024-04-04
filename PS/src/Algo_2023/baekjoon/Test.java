package Algo_2023.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    private static int T;
    private static int R;
    private static String S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        String str = "010-8510-4523";
        String[] arr = str.split("-");

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}
