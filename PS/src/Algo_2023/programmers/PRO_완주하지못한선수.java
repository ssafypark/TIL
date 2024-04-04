package Algo_2023.programmers;

import java.util.*;

public class PRO_완주하지못한선수 {

    private static String answer;

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        for (int i = 0; i < completion.length; i++) {
            map.put(completion[i], map.get(completion[i]) - 1);
        }
        for (String str : map.keySet()) {
            if (map.get(str) != 0) {
                answer = str;
            }
        }
        return answer;
    }
}