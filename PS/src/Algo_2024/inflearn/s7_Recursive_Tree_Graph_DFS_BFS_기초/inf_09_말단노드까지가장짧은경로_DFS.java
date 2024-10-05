package Algo_2024.inflearn.s7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 1, 2, 3, 4, 5 의 엣지 노드를 가지고 있음
* 가장 짧은 엣지 길이 출력 -> 1 (1번에서 3번 노드까지 1거리)
* */
public class inf_09_말단노드까지가장짧은경로_DFS {

    private static Node09 root;

    public static int DFS(int depth, Node09 root) {
        if (root.lt == null && root.rt == null) {
//            return root.data;
            return depth;
        } else {
            return Math.min(DFS(depth + 1, root.lt), DFS(depth + 1, root.rt));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        root = new Node09(1);
        root.lt = new Node09(2);
        root.rt = new Node09(3);
        root.lt.lt = new Node09(4);
        root.lt.rt = new Node09(5);
        System.out.println(DFS(0, root));
    }
}

class Node09 {
    int data;
    Node09 lt;
    Node09 rt;
    public Node09(int val) {
        data = val;
        lt = null;
        rt = null;
    }
}