package Algo_2024.inflearn.s2_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class inf_06_뒤집은소수 {

    private static int N;
    private static int[] arr;

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int reverse = 0;
            while (temp > 0) {
                int math_remainder = temp % 10;
                reverse = reverse * 10 + math_remainder;
                temp /= 10;
            }
            if(isPrime(reverse)) {
                answer.add(reverse);
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
