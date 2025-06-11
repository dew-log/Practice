/*문제: 짝수일 때만 2로 나누기 (음수 포함)

문제 설명
사용자로부터 정수 n을 입력받습니다. 이 수가 짝수일 경우,
n을 계속해서 2로 나눕니다. 그리고 각 단계에서 나눈 결과를 출력합니다.

반복은 n이 홀수일 때 종료됩니다.

음수여도 짝수라면 동일한 방식으로 나누기를 반복합니다.
마지막으로 나누기를 수행한 횟수를 출력하세요.

입력 31
횟수 : 0

입력 40
40/2 -> 20
20/2 -> 10
10/2 -> 5
횟수 : 3*/

import java.util.Scanner;                                       // 스캐너설정

public class while04 {
    public static void main(String[] args) {                    // 메인설정
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 >> ");
        int num = sc.nextInt();                                 // 정수설정 - 사용자로부터 정수 n을 입력받습니다.
        int score = 0;                                          // 나눈값을 출력하기 위한 설정
        System.out.println("입력 " + num );

            while (num % 2 == 0 ) {                                  // 이 수가 짝수일 경우,
                int result = num / 2;                               // result 입력. 
                System.out.println( num + "/2 -> " + result );     // 그리고 각 단계에서 나눈 결과를 출력합니다
                num /= 2;                                           // 정수를 실제로 나눠줌줌
                score++;                                            // 나눈 수의 +a의 값을 위해 입력                              
        }
        System.out.println("횟수 : " + score );
        System.out.println("종료되었습니다");               // 탈출문    
    }
}
