package Algo_2024.inflearn.s9_GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class inf_01_씨름선수 {

    private static int N;

    public static int solution(ArrayList<Body> list) {
        int cnt = 0;
        Collections.sort(list);
        int max = Integer.MIN_VALUE;
        for (Body o : list) {
            if (o.w > max) {
                max = o.w;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ArrayList<Body> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(new Body(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        System.out.println(solution(list));
    }
}

class Body implements Comparable<Body> {
    int h;
    int w;
    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Body o) {
        return o.h - this.h;
    }
}
