package baekjoon;

import java.util.Scanner;

public class BOJ_1065_한수 {

    private static int N;
    private static int hun;
    private static int ten;
    private static int one;
    private static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        cnt = 0;

        if (N < 100) {
            System.out.println(N);
        } else if (100 <= N && N <= 110) {
            System.out.println(99);
        } else {
            for(int i = 111; i <= N; i++) {
                hun = i / 100;
                ten = i % 100 / 10;
                one = i % 100 % 10;

                if(Math.abs(hun - ten) == Math.abs(ten - one) && hun < ten && ten < one) {
                    cnt++;
                } else if (Math.abs(hun - ten) == Math.abs(ten - one) && hun > ten && ten > one) {
                    cnt++;
                } else if (hun == ten && ten == one) {
                    cnt++;
                }
            }
            System.out.println(cnt + 99);
        }
    sc.close();
    }
}
