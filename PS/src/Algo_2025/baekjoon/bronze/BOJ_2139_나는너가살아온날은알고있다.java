package Algo_2025.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2139_나는너가살아온날은알고있다 {

    public static int day;
    public static int month;
    public static int year;
    public static int[] arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            day = Integer.parseInt(st.nextToken());
            month = Integer.parseInt(st.nextToken());
            year = Integer.parseInt(st.nextToken());
            if (day == 0) {
                break;
            }
            System.out.println(solution());
        }
    }

    public static int solution() {
        int answer = 0;
        boolean flag = false; // 윤년아님
        if (year % 4 == 0) {
            flag = true;
        }
        if (year % 100 == 0) {
            flag = false;
        }
        if (year % 400 == 0) {
            flag = true;
        }
        for (int i = 0; i < month; i++) {
            answer += arr[i];
        }
        answer += day;
        if (flag && month > 2) {
            answer++;
        }
        return answer;
    }
}
