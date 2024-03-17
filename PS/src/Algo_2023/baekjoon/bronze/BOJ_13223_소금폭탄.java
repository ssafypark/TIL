package Algo_2023.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_13223_소금폭탄 {

    private static int hour;
    private static int minute;
    private static int second;
    private static int nowHour;
    private static int nowMinute;
    private static int nowSecond;
    private static int afterHour;
    private static int afterMinute;
    private static int afterSecond;
    private static String[] nowTime;
    private static String[] afterTime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        nowTime = br.readLine().split(":");
        afterTime = br.readLine().split(":");
        nowHour = Integer.parseInt(nowTime[0]);
        nowMinute = Integer.parseInt(nowTime[1]);
        nowSecond = Integer.parseInt(nowTime[2]);
        afterHour = Integer.parseInt(afterTime[0]);
        afterMinute = Integer.parseInt(afterTime[1]);
        afterSecond = Integer.parseInt(afterTime[2]);
        hour = afterHour - nowHour;
        minute = afterMinute - nowMinute;
        second = afterSecond - nowSecond;
        if (second < 0) {
            second += 60;
            minute--;
        }
        if (minute < 0) {
            minute += 60;
            hour--;
        }
        if (hour <= 0) {
            hour += 24;
        }
        System.out.printf("%02d:%02d:%02d", hour, minute, second);
    }
}
