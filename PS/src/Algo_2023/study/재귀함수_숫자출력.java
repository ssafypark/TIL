package Algo_2023.study;

public class 재귀함수_숫자출력 {

    public static void main(String[] args) {
        PrintNumber pn = new PrintNumber();

        System.out.println("1부터 10까지 오름차순 출력");
        pn.asc(10);

        System.out.println();

        System.out.println("1부터 10까지 내림차순 출력");
        pn.desc(10);
    }
}

class PrintNumber {
    public void asc(int n) {
        if (n == 0) {
            return;
        }
        asc(n - 1);
        System.out.print(n);
    }

    public void desc(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n);
        desc(n - 1);
    }
}