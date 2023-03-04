package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_4949_균형잡힌세상 {

    private static String str;
    private static char ch;
    private static char temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        str = br.readLine();
        while (!str.equals(".")) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')' || ch == ']') {
                    if (!stack.isEmpty()) {
                        temp = stack.peek();
                        if (ch == ')' && temp == '(' || ch == ']' && temp == '[') {
                            stack.pop();
                        } else {
                            break;
                        }
                    } else {
                        stack.push(ch);
                    }
                }
            }
            if (stack.isEmpty()) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
            str = br.readLine();
        }
        System.out.println(sb);
    }
}
