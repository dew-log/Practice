/*Q. 반복문과 결합해서 여러 번 입력 받기
    나이에 음수를 입력하면 "잘못된 입력입니다" 같은 예외 처리 넣기
    "몇 살이신가요?" → "당신은 고등학생입니다!" 식으로 문장 살짝 꾸미기
*/
import java.util.Scanner;                                   // 유틸 툴 불러오기

public class if0201 {                                    // 시작문
    public static void main(String[] args) {                // 메인함수
        Scanner sc = new Scanner(System.in);                // 입력 받겠다

        System.out.print("몇 살이신가요? >> ");          // 나이를 입력하라는 안내문

        int num = 0;                                        // 정수 선언
        int age = sc.nextInt();                             // 나이 등록
        sc.nextLine();                                      // nextInt 후 줄바꿈 에러가 남아있어 줄을 한칸 띄워줌

        System.out.print("당신은 ");

        if ( age >= 0 && age <= 7 ){                                    // 조건문 생성
            System.out.print("유아입니다");
        }
        else if ( age >= 8 && age <= 13 ){                  // 조건 1이 flase고 조건 2가 true일 때
            System.out.print("초등학생입니다");
        }
        else if ( age >= 14 && age <= 16 ){                 // 조건 2가 flase고 조건 2이 true일 때
            System.out.print("중학생입니다");
        }
        else if ( age >= 17 && age <= 19 ){                 // 조건 3이 flase고 조건 4가 true일 때
            System.out.print("고등학생입니다");
        }
        else if ( age <= 0 ){
            System.out.print("잘못된 입력입니다");              
        }
        else {
            System.out.print("성인입니다");
        }

        System.out.println("!");
    }
}
