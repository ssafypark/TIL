package Algo_2024.inflearn.s7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class inf_07_이진트리레벨탐색_BFS {

    private static Node07 root;

    public static void BFS(Node07 root) {
        Queue<Node07> queue = new LinkedList<>();
        queue.add(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node07 cur = queue.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) {
                    queue.offer(cur.lt);
                }
                if (cur.rt != null) {
                    queue.offer(cur.rt);
                }
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        root = new Node07(1);
        root.lt = new Node07(2);
        root.rt = new Node07(3);
        root.lt.lt = new Node07(4);
        root.lt.rt = new Node07(5);
        root.rt.lt = new Node07(6);
        root.rt.rt = new Node07(7);
        BFS(root);
    }
}

class Node07 {
    int data;
    Node07 lt;
    Node07 rt;

    public Node07(int val) {
        data = val;
        lt = null;
        rt = null;
    }
}