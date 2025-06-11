/*- 나이도 입력받고 "OO님은 OO살이군요!" 출력해보기
- 좋아하는 음식, 장소, 취미도 입력받아보기
- `println()` 말고 `print()` 써보면서 줄 바꿈 실험도 해보기 */

import java.util.Scanner;                               // 자바 기본툴을 스캔하겠다

public class basic05 {                                  // 구문 시작문
    public static void main(String[] args) {            // 구문 메인함수

        Scanner sc = new Scanner(System.in);            // 스캐너 불러오기

        System.out.println("이름을 입력하세요 >> ");
        String name = sc.nextLine();
        System.out.println("안녕하세요, " + name + "님!");

        System.out.println("나이를 입력하세요 >> ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print(name);
        System.out.print("님은 ");
        System.out.print(age);
        System.out.print("살이군요!");
        System.out.println();

        System.out.println("좋아하는 음식을 입력하세요 >> ");
        String food = sc.nextLine();
        System.out.println(name + "님은 " + food + "을(를) 좋아하시는군요");

        System.out.println("좋아하는 장소를 입력하세요 >> ");
        String place = sc.nextLine();
        System.out.println(place + " ! 좋은 장소네요 !");

        System.out.println("취미를 입력하세요 >> ");
        String hobby = sc.nextLine();
        System.out.println("저도 " + hobby + "하는 걸 좋아해요");
    }
}

