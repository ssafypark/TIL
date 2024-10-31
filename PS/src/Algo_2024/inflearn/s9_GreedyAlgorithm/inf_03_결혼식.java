package Algo_2024.inflearn.s9_GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class inf_03_결혼식 {

    private static int N;

    public static int solution(ArrayList<Time03> list) {
        int cnt = 0;
        int answer = Integer.MIN_VALUE;
        Collections.sort(list);
        for (Time03 o : list) {
            if (o.status == 's') {
                cnt++;
                answer = Math.max(answer, cnt);
            } else {
                cnt--;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ArrayList<Time03> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.add(new Time03(s, 's'));
            list.add(new Time03(e, 'e'));
        }
        System.out.println(solution(list));
    }
}

class Time03 implements Comparable<Time03> {
    int time;
    char status;

    Time03(int time, char status) {
        this.time = time;
        this.status = status;
    }

    @Override
    public int compareTo(Time03 o) {
        if (o.time == this.time) {
            return this.status - o.status;
        } else {
            return this.time - o.time;
        }
    }
}