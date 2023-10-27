package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2490_윷놀이 {

    private static int cnt;
    private static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            cnt = 0;
            str = br.readLine();
            for (int j = 0; j < 7; j++) {
                if(str.charAt(j) == '0') {
                    cnt++;
                }
            }
            if(cnt == 1) {
                System.out.println("A");
            } else if (cnt == 2) {
                System.out.println("B");
            } else if (cnt == 3) {
                System.out.println("C");
            } else if (cnt == 4) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        }
    }
}
