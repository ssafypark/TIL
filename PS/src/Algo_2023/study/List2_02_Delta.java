package Algo_2023.study;

public class List2_02_Delta {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // N * N 크기
        int N = arr.length;

        //현재 나의 좌표
        int r = 1;
        int c = 1;

        // 상하좌우
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int[][] drc = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // 4방향 탐색
        for (int d = 0; d < 4; d++) {
            // 다음 좌표 = 현재 좌표 + 델타
            int nr = r + dr[d];
            int nc = c + dc[d];
            // drc를 사용할 때
            int nr2 = r + drc[d][0]; // 행
            int nc2 = c + drc[d][1]; // 열

            // 배열의 경계를 벗어나지 않았는지를 항상 체크하고 사용해야함.
            // 확인을 하는 2가지 방법
            // 1. 맵(배열) 안에 들어있을 경우
            if (nr >= 0 && nr < N && nr >= 0 && nr < N) {
                System.out.println(arr[nr][nc]);
            }
            // 2. 맵(배열)을 벗어났으면 이번에는 넘어가
            if (nr < 0 || nr >= N || nc < 0 || nc >= N) {
                continue;
            }
            System.out.println(arr[nr][nc]);
        }
    }
}
