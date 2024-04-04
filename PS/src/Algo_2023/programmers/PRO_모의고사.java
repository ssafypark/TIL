package Algo_2023.programmers;

import java.util.*;

public class PRO_모의고사 {

    private static int[] person1 = {1, 2, 3, 4, 5};
    private static int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
    private static int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    private static int answer1 = 0;
    private static int answer2 = 0;
    private static int answer3 = 0;
    private static int max = Integer.MIN_VALUE;

    public int[] solution(int[] answers) {
        int[] answer = {};

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == person1[i % person1.length]) {
                answer1++;
            }
            if(answers[i] == person2[i % person2.length]) {
                answer2++;
            }
            if(answers[i] == person3[i % person3.length]) {
                answer3++;
            }
        }
        max = Math.max(Math.max(answer1, answer2), answer3);

        ArrayList<Integer> arrayList = new ArrayList<>();
        if(max == answer1) {
            arrayList.add(1);
        }
        if(max == answer2) {
            arrayList.add(2);
        }
        if(max == answer3) {
            arrayList.add(3);
        }

        answer = new int[arrayList.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}
