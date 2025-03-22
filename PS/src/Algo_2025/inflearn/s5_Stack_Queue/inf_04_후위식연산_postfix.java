package Algo_2025.inflearn.s5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class inf_04_후위식연산_postfix {

    private static String str;

    public static int solution() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                stack.add(str.charAt(i) - '0');
            } else {
                int right = stack.pop();
                int left = stack.pop();
                if (str.charAt(i) == '+') {
                    left += right;
                } else if (str.charAt(i) == '-') {
                    left -= right;
                } else if (str.charAt(i) == '*') {
                    left *= right;
                } else {
                    left /= right;
                }
                stack.add(left);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        System.out.println(solution());
    }
}
