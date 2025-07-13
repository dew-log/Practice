import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 공을 넣는 횟수
        int[] basket = new int[N]; // 바구니 배열 생성

        for (int i = 0; i < N; i++) {    // 바구니 안을 순회
            basket[i] = i + 1;        // 바구니 안을 채우는 반복문
        }
        for (int j = 0; j < M; j++) { // 공을 교환할 반복문
            int a = sc.nextInt(); // 문제에서 제시한 공 교환 i
            int b = sc.nextInt(); // 문제에서 제시한 공 교환 j
            int temp = 0;   // 임시변수
            temp = basket[a - 1];
            basket[a - 1] = basket[b - 1];
            basket[b - 1] = temp;
        }
        for (int k = 0; k < N; k++) {
            System.out.print(basket[k] + " ");
        }
    }
}
