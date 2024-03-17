package Algo_2023.study;

public class 소수약수_에라토스테네스의체 {

    public static void main(String[] args) {
        // 소수 : 약수가 1과 자기 자신밖에 없는 자연수 (1보다 큼)
        // 약수 : 어떠한 자연수를 나머지가 0으로 만드는 수 - 2 > 4
        System.out.println(getPrimeEratos(1000));
    }

    // 약수, 소수 - 1차적 코딩
    public static int getPrime(int n) {
        int cnt = 0; // 소수의 갯수
        // 4
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            // 2, 3, 4
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                cnt++;
            }
        }
        return cnt;
    }

    // 에라토스테네스 체
    // 2, 3, 4, 5, 6, 7, 8, 9...n : 지울게 되는 첫번째 = 소수, 배수를 지운다
    // 1) 3, 5, 7, 9...n : 소수 2 삭제, 2의 배수 삭제
    // 2) 5, 7... : 3이 소수, 3의 배수 삭제
    // 3) 5, 7... : 5가 소수가 된다
    public static int getPrimeEratos(int n) {
        int cnt = 0;
        boolean[] check = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (!check[i]) { // false면 소수
                cnt++;
            }
            for (int j = i * 2; j <= n; j += i) {
                check[j] = true; // 배수를 지웠다
            }
        }
        return cnt;
    }
}
