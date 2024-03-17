package Algo_2023.baekjoon.bronze;

import java.io.*;
import java.util.*;

public class BOJ_2864_5와6의차이 {

    private static String str1;
    private static String str2;
    private static String temp1 = "";
    private static String temp2 = "";
    private static int min;
    private static int max;
    private static char[] arr1;
    private static char[] arr2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        str1 = st.nextToken();
        str2 = st.nextToken();
        arr1 = new char[str1.length()];
        arr2 = new char[str2.length()];
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == '6') {
                arr1[i] = '5';
            } else {
                arr1[i] = str1.charAt(i);
            }
            temp1 += arr1[i];
        }
        for (int i = 0; i < str2.length(); i++) {
            if(str2.charAt(i) == '6') {
                arr2[i] = '5';
            } else {
                arr2[i] = str2.charAt(i);
            }
            temp2 += arr2[i];
        }
        min = Integer.parseInt(temp1) + Integer.parseInt(temp2);
        temp1 = "";
        temp2 = "";
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == '5') {
                arr1[i] = '6';
            } else {
                arr1[i] = str1.charAt(i);
            }
            temp1 += arr1[i];
        }
        for (int i = 0; i < str2.length(); i++) {
            if(str2.charAt(i) == '5') {
                arr2[i] = '6';
            } else {
                arr2[i] = str2.charAt(i);
            }
            temp2 += arr2[i];
        }
        max = Integer.parseInt(temp1) + Integer.parseInt(temp2);
        System.out.println(min + " " + max);
    }
}
