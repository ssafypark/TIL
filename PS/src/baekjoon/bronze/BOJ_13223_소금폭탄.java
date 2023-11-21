package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_13223_소금폭탄 {

    private static int currentHour;
    private static int currentMinute;
    private static int currentSecond;
    private static int dropHour;
    private static int dropMinute;
    private static int dropSecond;
    private static int currentTime;
    private static int dropTime;
    private static int needTime;
    private static int needHour;
    private static int needMinute;
    private static int needSecond;
    private static String[] current;
    private static String[] drop;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        current = br.readLine().split(":");
        currentHour = Integer.parseInt(current[0]);
        currentMinute = Integer.parseInt(current[1]);
        currentSecond = Integer.parseInt(current[2]);
        currentTime = currentHour * 3600 + currentMinute * 60 + currentSecond;

        drop = br.readLine().split(":");
        dropHour = Integer.parseInt(drop[0]);
        dropMinute = Integer.parseInt(drop[1]);
        dropSecond = Integer.parseInt(drop[2]);
        dropTime = dropHour * 3600 + dropMinute * 60 + dropSecond;

        needTime = dropTime - currentTime;
        if (needTime <= 0) {
            needTime += 24 * 3600;
        }
        needHour = needTime / 3600;
        needMinute = (needTime % 3600) / 60;
        needSecond = needTime % 60;

        System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);
    }
}
