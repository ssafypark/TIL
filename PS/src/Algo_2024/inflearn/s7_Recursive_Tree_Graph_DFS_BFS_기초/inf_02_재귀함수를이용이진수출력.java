package Algo_2024.inflearn.s7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.io.IOException;

/*
 *  입력예제
 *  11
 *
 *  출력예제
 *  1 0 1 1
 * */

public class inf_02_재귀함수를이용이진수출력 {

    public static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n / 2);
            System.out.print((n % 2) + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        DFS(11);
    }
}
