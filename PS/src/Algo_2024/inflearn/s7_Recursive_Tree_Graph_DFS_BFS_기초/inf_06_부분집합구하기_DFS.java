package Algo_2024.inflearn.s7_Recursive_Tree_Graph_DFS_BFS_기초;

/*
 * 입력예제
 * 3
 *
 * 출력예제
 * 1 2 3
 * 1 2
 * 1 3
 * 1
 * 2 3
 * 2
 * 3
 *
 **/
public class inf_06_부분집합구하기_DFS {

    private static int n;
    private static int[] ch;

    public static void DFS(int L) {
        if (L == n + 1) { // 종착점에 왔을때
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    tmp += (i + " ");
                }
            }
            if (tmp.length() > 0) {
                System.out.println(tmp);
            }
        } else {
            ch[L] = 1;
            DFS(L + 1); // 왼쪽으로 뻗을때
            ch[L] = 0;
            DFS(L + 1); // 오른쪽으로 뻗을때, 위의 DFS에 계속 걸리다가 마지막 레이어에서만 걸림
        }
    }

    public static void main(String[] args) {
        n = 3;
        ch = new int[n + 1];
        DFS(1);
    }
}
