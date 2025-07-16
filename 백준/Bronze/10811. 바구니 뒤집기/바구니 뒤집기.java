import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 몇 개의 바구니를 만들 것인지
        int M = sc.nextInt();   // 몇 번 반복할 것인지
        int[] basket = new int[N];   // 바구니를 담을 배열 생성

        for (int k = 0; k < N; k++) {    // 바구니를 순회하는 반복문 생성
            basket[k] = k + 1;    // 바구니에 번호 입력하기
        }

        for (int l = 0; l < M; l++) { // 바구니 번호 바꾸는 반복문
            int i = sc.nextInt();  // i번째 바구니 지정
            int j = sc.nextInt();  // j번째 바구니 지정
            int temp = 0;
            while (i < j) {
                temp = basket[i - 1];   // 바구니 번호를 임시값에 담음
                basket[i - 1] = basket[j - 1]; // 왼쪽 바구니에 오른쪽 바구니 값을 담음
                basket[j - 1] = temp;   // 오른쪽 바구니에 왼쪽 바구니값(임시값)을 저장함
                i++;
                j--;
            }
        }

        for (int m = 0; m < N; m++) {
            System.out.print(basket[m] + " ");// 바구니 왼쪽부터 출력하기
        }
    }
}
