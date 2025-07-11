import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 공을 넣는 횟수

        int[] basket = new int[N]; // 바구니 배열 생성 (자동으로 0으로 초기화됨)

        for (int m = 0; m < M; m++) {
            int i = sc.nextInt(); // 시작 바구니 번호
            int j = sc.nextInt(); // 끝 바구니 번호
            int k = sc.nextInt(); // 넣을 공 번호

            // i번부터 j번 바구니까지 공 번호 k를 넣는다
            for (int x = i - 1; x <= j - 1; x++) {
                basket[x] = k; // 배열은 0부터 시작하니까 인덱스 보정
            }
        }

        // 최종 바구니 상태 출력
        for (int i = 0; i < N; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
