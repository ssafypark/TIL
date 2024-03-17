package Algo_2023.baekjoon.bronze;

import java.io.*;
import java.util.*;

public class BOJ_10798_세로읽기 {

    private static String str;
    private static ArrayList<Character>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        list = new ArrayList[5];
        for (int i = 0; i < 5; i++) {
            list[i] = new ArrayList<>();
            str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                list[i].add(str.charAt(j));
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (list[j].size() <= i) {
                    continue;
                } else {
                    System.out.print(list[j].get(i));
                }
            }
        }
    }
}
