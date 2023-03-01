package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1541_잃어버린괄호 {

    private static int sum;
    private static int temp;
    private static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer minus = new StringTokenizer(br.readLine(), "-");
        while(minus.hasMoreTokens()) {
            StringTokenizer add = new StringTokenizer(minus.nextToken(), "+");
            temp = 0;
            while(add.hasMoreTokens()) {
                temp += Integer.parseInt(add.nextToken());
            }
            cnt++;
            if (cnt == 1) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
