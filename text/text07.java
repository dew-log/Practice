import java.util.Scanner;

/* 7.  알파벳 한 칸 밀기 (시저 암호 1단계)
설명: 알파벳 하나를 입력 받아, 알파벳 순서에서 다음 글자를 출력하시오. Z → A, z → a로 순환.
입력 : d
출력 : e
*/
public class text07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char apb = sc.next().charAt(0);
        char next;

        if (apb == 'z') {
            next = 'a'; // 소문자 z일 때는 a로
        } else if (apb == 'Z') {
            next = 'A'; // 대문자 Z일 때는 A로
        } else {
            next = (char)(apb + 1); // 그 외에는 다음 문자
        }
        System.out.println(next);
    }
}
