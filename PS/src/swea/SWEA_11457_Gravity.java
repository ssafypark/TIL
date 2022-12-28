package swea;

public class SWEA_11457_Gravity {

    private static int max;
    private static int cnt;

    public static void main(String[] args) {
        int[] box = {7, 4, 2, 0, 0, 6, 0, 7, 0};

        for (int i = 0; i < box.length; i++) {
            cnt = 0;

            for (int j = i + 1; j < box.length; j++) {
                if (box[i] > box[j]) {
                    cnt++;
                }
                if (max < cnt) {
                    max = cnt;
                }
            }
        }
        System.out.println(max);
    }
}
