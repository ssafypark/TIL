package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1543_문서검색 {

    private static int cnt;
    private static int startIndex;
    private static String doc;
    private static String word;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        doc = br.readLine();
        word = br.readLine();

        while(true) {
            int findIndex = doc.indexOf(word, startIndex);
            if (findIndex < 0) {
                break;
            }
            cnt++;
            startIndex = findIndex + word.length();
        }
        System.out.println(cnt);
    }
}
