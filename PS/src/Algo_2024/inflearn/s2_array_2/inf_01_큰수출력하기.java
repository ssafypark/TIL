package Algo_2024.inflearn.s2_array_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class inf_01_큰수출력하기 {

    private static int N;
    private static int[] arr;

    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1 ; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int x : solution(arr)) {
            System.out.print(x + " ");
        }
    }
}
