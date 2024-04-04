package Algo_2023.study;

public class 순열연습_prac2 {

    private static int N; // N 중에 R개 선택하여 조합
    private static int R; // N 중에 R개 선택하여 조합
    private static int[] data;
    private static int[] sel;
    private static boolean[] visited;

    public static void main(String[] args) {
        N = 4;
        R = 2;
        data = new int[]{1, 2, 3, 4};
        sel = new int[R];
        visited = new boolean[N];
        print("반복문을 이용한 순열 - 무조건 2개 뽑기");
        permutation1();
    }

    private static void permutation1() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                System.out.println(data[i] + ", " + data[i]);
            }
        }
    }

    private static void print(String message) {
        System.out.println("----------------");
        System.out.println(message);
        System.out.println("----------------");
    }
}
