package Algo_2023.programmers;

public class PRO_최소직사각형 {

    private static int maxWidth;
    private static int maxHeight;
    private static int width;
    private static int height;

    public int solution(int[][] sizes) {
        int answer = 0;
        maxWidth = Integer.MIN_VALUE;
        maxHeight = Integer.MIN_VALUE;

        for(int i = 0; i < sizes.length; i++) {
            width = Math.max(sizes[i][0], sizes[i][1]);
            height = Math.min(sizes[i][0], sizes[i][1]);
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }
        return answer = maxHeight * maxWidth;
    }
}
