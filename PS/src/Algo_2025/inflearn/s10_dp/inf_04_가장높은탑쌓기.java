package Algo_2025.inflearn.s10_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class inf_04_가장높은탑쌓기 {

    private static int N;
    private static int[] dp;
    private static ArrayList<Brick> list;

    public static int solution() {
        int answer = 0;
        dp[0] = list.get(0).h;
        answer = dp[0];
        for (int i = 1; i < N; i++) {
            int maxH = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (list.get(j).w > list.get(i).w && dp[j] > maxH) {
                    maxH = dp[j];
                }
            }
            dp[i] = list.get(i).h + maxH;
            answer = Math.max(answer, dp[i]);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        list = new ArrayList<>();
        N = Integer.parseInt(br.readLine());
        dp = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list.add(new Brick(s, h, w));
        }
        Collections.sort(list);
        System.out.println(solution());
    }
}

class Brick implements Comparable<Brick> {
    public int s; // 넓이
    public int h; // 높이
    public int w; // 무게

    public Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick o) {
        return o.s - this.s;
    }
}