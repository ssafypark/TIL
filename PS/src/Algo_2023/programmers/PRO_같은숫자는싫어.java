package Algo_2023.programmers;

import java.util.Stack;

public class PRO_같은숫자는싫어 {

    private static int cnt;

    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.empty()) {
                stack.push(arr[i]);
                cnt++;
            } else if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
                cnt++;
            } else {
                continue;
            }
        }
        int[] answer = new int[cnt];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}
//    arr              answer
//  [1,1,3,3,0,1,1]	  [1,3,0,1]
//  [4,4,4,3,3]	      [4,3]
