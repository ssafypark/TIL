package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1919_애너그램만들기 {

    private static String a;
    private static String b;
    private static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = br.readLine();
        b = br.readLine();
        int[] cntA = new int[26];
        int[] cntB = new int[26];
        for (int i = 0; i < a.length(); i++) {
            cntA[a.charAt(i) - 'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            cntB[b.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(cntA[i] - cntB[i]);
        }
        System.out.println(ans);
    }
}
