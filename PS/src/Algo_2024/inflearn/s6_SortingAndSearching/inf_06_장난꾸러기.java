package Algo_2024.inflearn.s6_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class inf_06_장난꾸러기 {

    private static int N;
    private static int[] arr;
    private static int[] sort;

    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        sort = arr.clone();
        Arrays.sort(sort);
        for (int i = 0; i < N; i++) {
            if (arr[i] != sort[i]) {
                answer.add(i+1);
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
