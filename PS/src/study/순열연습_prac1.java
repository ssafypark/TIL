package study;

import java.util.Arrays;

public class 순열연습_prac1 {

    static int N, R; // N 중에 R개 선택하여 조합
    static int[] data, sel;
    static boolean[] visited;

    public static void main(String[] args) {
        N = 4;
        R = 2;
        data = new int[]{1, 2, 3, 4};
        sel = new int[R];
        visited = new boolean[N];
        print("반복을 이용한 순열 - 무조건 2개 뽑기");
        perm1();
        print("방문처리를 이용한 순열");
        perm2(0);
        print("방문처리를 비트마스킹 순열");
        perm3(0, 0);
    }

    private static void perm1() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j)
                    continue;
                System.out.println(data[i] + ", " + data[j]);
            }
        }
    }

    private static void perm2(int cnt) {
        if (cnt == R) {
            System.out.println(Arrays.toString(sel));
            return;
        }
        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            sel[cnt] = data[i];
            visited[i] = true;
            perm2(cnt + 1);
            visited[i] = false;

        }
    }

    private static void perm3(int sidx, int visited) {
        if (sidx == R) {
            System.out.println(Arrays.toString(sel));
            return;
        }
        for (int i = 0; i < N; i++) {
            if ((visited & 1 << i) > 0) continue;
            sel[sidx] = data[i];
            perm3(sidx + 1, visited | 1 << i);
        }
    }

    private static void print(String msg) {
        System.out.println("----------------");
        System.out.println(msg);
        System.out.println("----------------");
    }
}
