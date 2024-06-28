package Algo_2024.inflearn.s7_Recursive_Tree_Graph_DFS_BFS_기초;

/*
 * 입력예제
 * 10
 *
 * 출력예제
 * 1 1 2 3 5 8 13 21 34 55
 **/
public class inf_04_피보나치재귀_메모이제이션 {

    private static int[] fibo;

    public static int DFS(int n) {
        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        fibo = new int[n + 1];
        DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}