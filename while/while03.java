import java.util.Scanner;

public class while03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){                                       // 무한 반복문 생성
            System.out.print("숫자를 입력하세요 >> ");     // 출력
            int num = sc.nextInt();                         // 입력
                      
            if ( num == 0 ){
                System.out.println("종료합니다");
            break;
            }
                                                                        // (=정수임)
            if ( num > 0 && num % 2 == 0 ) {               // 만약 num이 0보다 크다. 그리고! num이 짝수일때
                System.out.println("양의 짝수입니다");     // 출력
            }else if (num > 0 && num % 2 == 1 ) {           // 만약 num이 0보다 크다. 그리고! num이 홀수임.
                System.out.println("양의 홀수입니다");     // 출력
            }
                                                                       // (=실수임)
            if ( num < 0 && num % 2 == 0 ) {                 // 만약 num 0보다 작음. 그리고! num이 짝수네 ?
                System.out.println("음의 짝수입니다");      // 출력
            }else if ( num < 0 && num % 2 == -1 ) {          // 만약 num 0보다 작음. 그리고! num이 홀수임.
                System.out.println("음의 홀수입니다");      // ㅊㄹ
            }
        }  
    }
}
