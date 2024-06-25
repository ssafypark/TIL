package Algo_2024.inflearn.s7_Recursive_Tree_Graph_DFS_BFS_기초;

public class inf_01_재귀함수_스택프레임 {

    public static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        DFS(3);
    }
}
