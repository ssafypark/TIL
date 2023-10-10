package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사람찾기 {

    private static int N;
    private static int M;
    private static int sum;
    private static String[] arr1;
    private static String[] arr2;
    private static String zero = "0";
    private static String slash = "/////////////////// ";
    private static String first = "첫 번째 데이터 갯수를 입력해주세요 ";
    private static String second = "두 번째 데이터 갯수를 입력해주세요 ";
    private static String firstValues = "첫 번째 데이터를 입력해주세요 ";
    private static String secondValues = "두 번째 데이터를 입력해주세요 ";
    private static String answer = "결과값 입니다 ";
    private static String count = "건 조회 되었습니다 ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(slash + first + slash);
        N = Integer.parseInt(br.readLine());
        System.out.println(slash + second + slash);
        M = Integer.parseInt(br.readLine());
        arr1 = new String[N];
        arr2 = new String[M];
        System.out.println(slash + firstValues + slash);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = br.readLine();
        }
        System.out.println(slash + secondValues + slash);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = br.readLine();
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == zero) {
                continue;
            }
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    arr1[i] = zero;
                    arr2[j] = zero;
                }
            }
        }
        System.out.println(slash + answer + slash);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != zero) {
                System.out.println(arr1[i]);
                sum++;
            }
        }
        System.out.println(slash + sum + count + slash);
    }
}

/**
 * 사용법
 * 1. 첫번째 인원 수 입력
 * 2. 두번째 인원 수 입력
 * 3. 첫번째 사번 입력(엔터로 구분이 되어있어야 함)
 * 4. 두번째 사번 입력(동일)
 * 5. 결과 출력
 */
