package Algo_2025.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1193_분수찾기 {

    private static int X;
    private static int x = 1;
    private static int y = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        X = Integer.parseInt(br.readLine());
        boolean flag = true;
        int cnt = 1;
        for (int i = 0; i < X - 1; i++) {
            if (x == 1 && y == 1) {
                y++;
            } else if (x == 1 && y == 2) {
                x++;
                y--;
            } else if ((x == 1 && y != 1) && flag == true) {
                y++;
                flag = false;
                cnt++;
            } else if ((x != 1 && y == 1) && flag == true) {
                x++;
                flag = false;
                cnt++;
            } else if (cnt % 2 == 0) {
                x--;
                y++;
                flag = true;
            } else if (cnt % 2 == 1) {
                x++;
                y--;
                flag = true;
            }
        }
        System.out.println(x + "/" + y);
    }
}
