package Algo_2024.inflearn.Prac.s9_GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;

public class inf_02_회의실배정 {

    private static int N;

    public static int solution(ArrayList<TimeP> list) {
        int cnt = 0;
        Collections.sort(list);
        for (TimeP o : list) {
            int endTime = 0;
            if (o.s >= endTime) {
                cnt++;
                endTime = o.e;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ArrayList<TimeP> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(new TimeP(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        System.out.println(solution(list));
    }
}

class TimeP implements Comparable<TimeP> {
    int s;
    int e;

    TimeP(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(TimeP o) {
        if (o.e == this.e) {
            return this.s - o.s;
        } else {
            return this.e - o.e;
        }
    }
}