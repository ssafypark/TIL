package Algo_2024.inflearn.s7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class inf_10_Tree말단노드까지가장짧은경로 {

    private static Node10 root;

    public static int BFS(Node10 root) {
        int answer = 0;
        Queue<Node10> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node10 cur = queue.poll();
                if (cur.lt == null && cur.rt == null) {
                    return L;
                }
                if (cur.lt != null) {
                    queue.offer(cur.lt);
                }
                if (cur.rt != null) {
                    queue.offer(cur.rt);
                }
            }
            L++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        root = new Node10(1);
        root.lt = new Node10(2);
        root.rt = new Node10(3);
        root.lt.lt = new Node10(4);
        root.lt.rt = new Node10(5);
        System.out.println(BFS(root));
    }
}

class Node10 {
    int data;
    Node10 lt;
    Node10 rt;

    public Node10(int val) {
        data = val;
        lt = null;
        rt = null;
    }
}