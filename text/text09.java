import java.util.Scanner;

/* 9. 알파벳 반대 문자 출력하기
설명: 알파벳 하나를 입력받으면 알파벳 순서상 정반대 문자를 출력하시오.
즉, a ↔ z, b ↔ y, A ↔ Z, B ↔ Y ...
입력 : C
출력 : X
*/
public class text09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char apb = sc.next().charAt(0);
        char next;

        if (Character.isLowerCase(apb)) {
            next = (char)('z' - (apb - 'a'));
        } else if (Character.isUpperCase(apb)) {
            next = (char)('Z' - (apb - 'A'));
        } else {
            next = apb;
        }
        System.out.println(next);
    }
}
