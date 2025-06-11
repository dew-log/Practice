// 정수를 계속 입력받아 짝수/홀수 판별하기

import java.util.Scanner;

public class while02 {
    public static void main(String[] args) {            // 메인함수

        Scanner sc = new Scanner(System.in);            // 스캐너 정보 불러오기
        
        while(true){                                    // 무한반복문 생성
            System.out.print("숫자를 입력하세요 >> ");
            int num = sc.nextInt();

            if ( num == 0 ){                             // num이 0일 때 종료
                System.out.println("종료합니다");
                break;
            }
            if (num % 2 == 0){                          // num이 짝수일 때 출력
                System.out.println("짝수입니다");
            }
            else {
                System.out.println("홀수입니다");      // 전부 false일 때 출력
            }
        }
    }
}
