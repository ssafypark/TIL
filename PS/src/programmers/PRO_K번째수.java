package programmers;

import java.util.*;

public class PRO_K번째수 {

    private static int a;
    private static int b;
    private static int c;
    private static int[] temp;

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            a = commands[i][0];
            b = commands[i][1];
            c = commands[i][2];

            temp = Arrays.copyOfRange(array, a - 1, b);
            Arrays.sort(temp);
            answer[i] = temp[c -  1];
        }
        return answer;
    }
}
