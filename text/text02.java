import java.util.Scanner;

/* 2. 숫자인 문자 판별하기
문자열이 주어졌을 때, 숫자인 문자만 출력하시오.
입력: a1b2c3
출력: 123
*/
public class text02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for(int i = 0; i<text.length(); i++){
            char ch = text.charAt(i);       // i번째 글자를 꺼내서 ch라는 상자에 담는 코드
            if (Character.isDigit(ch)){     // ch가 숫자인지 확인 (0~9 중 하나인지 확인하는 코드)
                System.out.print(ch);
            }
        }
    }
}
