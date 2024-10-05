package Algo_2024.inflearn.s7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_05_이진트리순회_DFS {

    private static Node root;

    public static void DFS(Node root) {
        if (root == null) {
            return;
        } else {
            // 전위순회
            System.out.print(root.data + " ");
            DFS(root.lt);
            // 중위순회
            // System.out.print(root.data + " ");
            DFS(root.rt);
            // 후위순회
            // System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        DFS(root);
    }
}

// 노트 클래스
class Node {
    int data;
    Node lt;
    Node rt;
    public Node(int val) {
        data = val;
        lt = null;
        rt = null;
    }
}