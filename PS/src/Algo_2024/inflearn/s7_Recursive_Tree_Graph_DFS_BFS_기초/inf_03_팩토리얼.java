package Algo_2024.inflearn.s7_Recursive_Tree_Graph_DFS_BFS_기초;

/*
* 입력예제
* 5
*
* 출력예제
* 120
*
* 5! = 5 * 4 * 3 * 2 * 1 = 120
* */

public class inf_03_팩토리얼 {

    public static int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(DFS(5));
    }
}
