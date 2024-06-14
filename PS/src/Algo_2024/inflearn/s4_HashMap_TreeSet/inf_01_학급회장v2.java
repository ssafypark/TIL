package Algo_2024.inflearn.s4_HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class inf_01_학급회장v2 {

    /*
    * 입력값
    *   15
        BACBACCACCBDEDE

    * */
    private static int N;
    private static int max = Integer.MIN_VALUE;
    private static String str;

    public static char solution(int N, String str) {
        char answer = ' ';
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char x : str.toCharArray()) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }
        System.out.println(hashMap.containsKey('A')); // True
        System.out.println(hashMap.containsKey('F')); // False
        System.out.println(hashMap.size()); // 5
        System.out.println(hashMap.remove('A')); // A키 삭제 -> 삭제 매우 중요
        System.out.println(hashMap.size()); // 4

        for (char key : hashMap.keySet()) {
            // 탐색하는 방법
            // System.out.println(key + " " + hashMap.get(key));
            if (hashMap.get(key) > max) {
                max = hashMap.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        str = br.readLine();
        System.out.println(solution(N, str));
    }
}
