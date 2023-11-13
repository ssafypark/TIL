package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14888_연산자끼워넣기 {

    private static int N;
    private static int max;  // 정답 기록용
    private static int min;  // 상동
    private static int[] nums; // 숫자를 들고 있을 배열
    private static int[] operators; // 연산자
    private static int[] order; // 어떤 순서로 연산자를 배열했는지 기록

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        nums = new int[N];  // 갯수만큼 배열을 만들어줌
        operators = new int[4]; // 연산자의 개수
        order = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        rec_func(0);
        System.out.println(max);
        System.out.println(min);
    }

    private static void rec_func(int k) {
        if (k == N - 1) {
            // 완성 된 식에 맞게 계산을 해서 정답에 갱신하는 작업
            int value = calculator();
            max = Math.max(max, value);
            min = Math.min(min, value);
        } else {
            for (int i = 0; i < 4; i++) {
                if (operators[i] >= 1) {
                    operators[i]--;
                    order[k] = i;
                    rec_func(k + 1);
                    operators[i]++;
                    order[k] = 0;
                }
            }
        }
    }

    private static int calculator() {
        int value = nums[0];
        for (int i = 0; i < N - 1; i++) {
            if (order[i] == 0) {
                value += nums[i + 1];
            } else if (order[i] == 1) {
                value -= nums[i + 1];
            } else if (order[i] == 2) {
                value *= nums[i + 1];
            } else {
                value /= nums[i + 1];
            }
        }
        return value;
    }
}
