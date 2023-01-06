package study;

import java.util.Arrays;

public class 조합연습_prac1 {

    private static int N; // N 중에 R개 선택하여 조합
    private static int R; // N 중에 R개 선택하여 조합
    private static int[] data;
    private static int[] sel;

    public static void main(String[] args) {
        N = 6;
        R = 3;

        data = new int[]{1, 2, 3, 4, 5, 6};
        sel = new int[R];

        print("반복을 이용한 조합 - 무조건 3개 뽑기");
        comb1();
        print("반복 + 재귀를 이용한 조합 - 무조건 3개 뽑기");
        comb2(0, 0);
        print("재귀를 이용한 조합 - 무조건 3개 뽑기");
        comb3(0, 0);
    }

    private static void comb1() {
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    System.out.println(data[i] + ", " + data[j] + ", " + data[k]);
                }
            }
        }
    }

    private static void comb2(int sidx, int idx) {
        if (sidx == R) {
            System.out.println(Arrays.toString(sel));
            return;
        }
        for (int i = idx; i < N; i++) {
            sel[sidx] = data[i];
            comb2(sidx + 1, i + 1);
        }
    }

    private static void comb3(int idx, int sidx) {
        if (sidx == R) {
            System.out.println(Arrays.toString(sel));
            return;
        }
        if (idx == N) {
            return;
        }
        sel[sidx] = data[idx];
        comb3(idx + 1, sidx + 1);
        comb3(idx + 1, sidx);
    }

    private static void print(String msg) {
        System.out.println("----------------");
        System.out.println(msg);
        System.out.println("----------------");
    }
}
