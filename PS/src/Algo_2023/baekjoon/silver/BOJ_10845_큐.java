package Algo_2023.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_10845_큐 {

    private static int N;
    private static int last;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push" :
                    last = Integer.parseInt(st.nextToken());
                    queue.add(last);
                    break;
                case "pop" :
                    if (!queue.isEmpty()) {
                        System.out.println(queue.poll());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "size" :
                    System.out.println(queue.size());
                    break;
                case "empty" :
                    if (queue.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front" :
                    if (!queue.isEmpty()) {
                        System.out.println(queue.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "back" :
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(last);
                    }
                    break;
            }
        }
    }
}
