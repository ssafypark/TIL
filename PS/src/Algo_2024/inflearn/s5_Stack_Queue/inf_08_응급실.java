package Algo_2024.inflearn.s5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Person {
    int id;
    int priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class inf_08_응급실 {

    private static int N;
    private static int M;
    private static int[] arr;

    public static int solution(int N, int M, int[] arr) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.offer(new Person(i, arr[i]));
        }
        while(!queue.isEmpty()) {
            Person p = queue.poll();
            for (Person x : queue) {
                if (p.priority < x.priority) {
                    queue.offer(p);
                    p = null;
                    break;
                }
            }
            if (p != null) {
                answer++;
                if (M == p.id) {
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(N, M, arr));
    }
}
