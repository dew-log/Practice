/*Q. 나이를 입력받아서 아래 조건에 맞게 출력하세요
나이	출력 내용
0 ~ 7세	"유아입니다"
8 ~ 13세	"초등학생입니다"
14 ~ 16세	"중학생입니다"
17 ~ 19세	"고등학생입니다"
20세 이상	"성인입니다"

사용자에게 "나이를 입력하세요 >> " 라고 출력하고, 정수 입력 받기

if, else if, else를 사용해서 구분하기
*/
import java.util.Scanner;                                   // 유틸 툴 불러오기

public class if02 {                                      // 시작문
    public static void main(String[] args) {                // 메인함수
        Scanner sc = new Scanner(System.in);                // 입력 받겠다

        System.out.print("나이를 입력하세요 >> ");          // 나이를 입력하라는 안내문

        int num = 0;                                        // 정수 선언
        int age = sc.nextInt();                             // 나이 등록
        sc.nextLine();                                      // nextInt 후 줄바꿈 에러가 남아있어 줄을 한칸 띄워줌

        if ( age <= 7 ){                                    // 조건문 생성
            System.out.println("유아입니다");
        }
        else if ( age >= 8 && age <= 13 ){                  // 조건 1이 flase고 조건 2가 true일 때
            System.out.println("초등학생입니다");
        }
        else if ( age >= 14 && age <= 16 ){                 // 조건 2가 flase고 조건 2이 true일 때
            System.out.println("중학생입니다");
        }
        else if ( age >= 17 && age <= 19 ){                 // 조건 3이 flase고 조건 4가 true일 때
            System.out.println("고등학생입니다");
        }
        else {
            System.out.println("성인입니다");              // 모든 조건이 false일 때
        }
    }
}
