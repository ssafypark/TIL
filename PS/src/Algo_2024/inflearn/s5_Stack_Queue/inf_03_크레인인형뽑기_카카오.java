package Algo_2024.inflearn.s5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class inf_03_크레인인형뽑기_카카오 {

    private static int N;
    private static int[][] board;
    private static int M;
    private static int[] moves;

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int position : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][position - 1] != 0) {  // 인형을 만났을때
                    int temp = board[i][position - 1];
                    board[i][position - 1] = 0;
                    if (!stack.isEmpty() && stack.peek() == temp) { // 스택에 인형이 있고, 가장 마지막에 들어갔던 인형이 뽑은 인형과 똑같을 때
                        answer += 2;
                        stack.pop(); // 인형 빼줌
                    } else {  // 스택에 아무 인형도 없을때
                        stack.push(temp);  // 인형 넣어줌
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        M = Integer.parseInt(br.readLine());
        moves = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(board, moves));
    }
}
