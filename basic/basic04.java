// 이름을 입력하세요 >> 이슬  
// → 출력: 안녕하세요, 이슬님!

import java.util.Scanner;                               // 자바 기본툴을 스캔하겠다

public class basic04 {                                  // 구문 시작문
    public static void main(String[] args) {            // 구문 메인함수

        Scanner sc = new Scanner(System.in);            // 스캐너 불러오기
        System.out.println("이름을 입력하세요 >> ");

        String name = sc.nextLine();

        System.out.println("안녕하세요, " + name + "님!");
    }
}
