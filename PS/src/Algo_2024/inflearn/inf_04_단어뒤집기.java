package Algo_2024.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class inf_04_단어뒤집기 {
    public static ArrayList<String> solution(int N, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] c = x.toCharArray();
            int lt = 0;
            int rt = x.length() - 1;
            while(lt < rt) {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(c));
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        for (String x : solution(N, arr)) {
            System.out.println(x);
        }
    }

}
