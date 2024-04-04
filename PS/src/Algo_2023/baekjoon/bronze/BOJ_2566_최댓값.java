package Algo_2023.baekjoon.bronze;

import java.io.*;
import java.util.*;

public class BOJ_2566_최댓값 {

    private static int x;
    private static int y;
    private static int max;
    private static int num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                num = Integer.parseInt(st.nextToken());
                if (max <= num) {
                    x = i + 1;
                    y = j + 1;
                }
                max = Math.max(max, num);
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
