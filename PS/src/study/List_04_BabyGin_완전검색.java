package study;

public class List_04_BabyGin_완전검색 {

    public static void main(String[] args) {
        int[] cards = {5, 4, 6};
        int N = 3;
        // 첫 번째 카드 뽑기
        for (int i = 0; i < N; i++) {
            // 두 번째 카드 뽑기
            for (int j = 0; j < N; j++) {
                // i와 j가 같아서는 안된다.
                if (i != j) {
                    // 세번째 카드 뽑기
                    for (int k = 0; k < N; k++) {
                        // k는 i와 j와는 달라야 한다.
                        if (i != k && j != k) {
                            System.out.printf("%d %d %d\n", cards[i], cards[j], cards[k]);
                            if (runCheck(cards[i], cards[j], cards[k])) {
                                System.out.println("run이야");
                            } else if (tripletCheck(cards[i], cards[j], cards[k])) {
                                System.out.println("triplet이야");
                            }
                        }
                    }
                }
            }
        }
    }
    // run은 a, b, c가 연속된 숫자인지 확인
    public static boolean runCheck(int a, int b, int c) {
        if (b == a + 1 && c == a + 2) {
            return true;
        } else {
            return false;
        }
    }
    // triplet은 a, b, c가 똑같은 숫자인지를 확인
    public static boolean tripletCheck(int a, int b, int c) {
        return a == b && a == c;
    }
}
