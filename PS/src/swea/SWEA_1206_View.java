package swea;

import java.util.Scanner;

public class SWEA_1206_View {

    private static int TC = 0;
    private static int N;
    private static int[] building;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (++TC <= 10) {
            N = sc.nextInt();
            building = new int[N];

            for (int i = 0; i < N; i++) {
                building[i] = sc.nextInt();
            }

            int cnt = 0;
            for (int i = 2; i < N - 2; i++) {
                int max = Math.max(building[i - 2], Math.max(building[i - 1], Math.max(building[i + 1], building[i + 2])));

                if(building[i] - max > 0) {
                    cnt += building[i] - max;
                }
            }

            System.out.println("#" + TC + " " + cnt);
        }
    }
}
