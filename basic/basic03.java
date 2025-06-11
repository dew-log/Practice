import java.util.Scanner;

public class basic03 {
    public static void main(String[] args) {
        // 사용자에게 정수를 입력받아
        // 짝수면 "짝수입니다", 홀수면 "홀수입니다" 출력하는 프로그램을 작성하세요

        Scanner sc = new Scanner(System.in);        // 스캐너 불러오기

        while(true){
            int num = sc.nextInt();

            if (num < 0)
                break;

            if (num % 2 == 0) {
                System.out.println("짝수입니다.");
            }
            else {
                System.out.println("홀수입니다.");
            }
        }
        System.out.println();
        sc.close();
    }
}
