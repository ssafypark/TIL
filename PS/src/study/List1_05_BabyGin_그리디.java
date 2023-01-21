package study;

public class List1_05_BabyGin_그리디 {

    public static void main(String[] args) {
        int[] cards = {5, 4, 6};
        // 편하게 run 검사를 하기 위해서
        int[] cnt  = new int[12];
        // 값을 카운팅 했다
        for (int i = 0; i < cards.length; i++) {
            cnt[cards[i]]++;
        }
        // 해당 i번째 카드를 검사
        int i = 0;
        while (i < 10) {
            // triplet 검사
            if (cnt[i] >= 3) {
                cnt[i] -= 3;
                System.out.println("triplet");
                continue;
            }
            // run 검사
            if (cnt[i] >= 1 && cnt[i + 1] >= 1 && cnt[i + 2] >= 1) {
                cnt[i]--;
                cnt[i+1]--;
                cnt[i+2]--;
                System.out.println("Run");
                continue;
            }
            i++;
        }
    }
}
