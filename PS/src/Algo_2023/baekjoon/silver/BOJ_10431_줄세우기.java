package Algo_2023.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10431_줄세우기 {

    private static int P;
    private static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        P = Integer.parseInt(br.readLine());

        while(P-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            T = Integer.parseInt(st.nextToken());
            int[] arr = new int[20];
            for (int i = 0; i < 20; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int cnt = 0;
            int[] sorted = new int[20];
            for (int i = 0; i < 20; i++) {
                // 1. 줄 서있는 학생 중에 자신보다 큰 학생을 찾는다.
                // 1-1. 찾지 못했다면, 줄의 가장 뒤에 선다.
                boolean flag = false;
                for (int j = 0; j < i; j++) {
                    if (sorted[j] > arr[i]) {
                        // 2. 찾았다면, 그 학생의 앞에 선다.
                        // 3. 그 학생과 그 뒤의 학생이 모두 한칸씩 물러난다.
                        flag = true;
                        for (int k = i - 1; k >= j; k--) {
                            sorted[k + 1] = sorted[k];
                            cnt++;
                        }
                        sorted[j] = arr[i];
                        break;
                    }
                }
                if (!flag) {
                    sorted[i] = arr[i];
                }
            }
            System.out.println(T + " " + cnt);
        }
    }
}
