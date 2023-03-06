package programmers;

import java.util.*;

public class PRO_포켓몬 {

    private static int N;
    private static int answer;

    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        N = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (N < set.size()) {
            answer = N;
        } else {
            answer = set.size();
        }
        return answer;
    }
}
