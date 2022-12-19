package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_1427_소트인사이드 {

    private static String str;
    private static String answer;
    private static Character[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        arr = new Character[str.length()];

        for(int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        Arrays.sort(arr, Collections.reverseOrder());

        answer = "";
        for(int i = 0; i < str.length(); i++) {
            answer += arr[i];
        }
        System.out.println(answer);
    }
}
