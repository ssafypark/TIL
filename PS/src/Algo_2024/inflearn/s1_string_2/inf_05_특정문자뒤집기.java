package Algo_2024.inflearn.s1_string_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_05_특정문자뒤집기 {

    private static String str;

    public static String solution(String str) {
        String answer = "";
        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while(lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
        }
        return answer = String.valueOf(chars);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        System.out.println(solution(str));
    }
}
