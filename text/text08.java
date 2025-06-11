import java.util.Scanner;

/* 8. 알파벳 두 칸 밀기 (시저 암호 2단계)
설명 : 알파벳 하나를 입력 받아, 2칸 뒤의 알파벳을 출력하시오. y → a, Z → B 순환.
입력 : Y
출력 : A
*/
public class text08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char apb = sc.next().charAt(0);
        char next;

        if (Character.isLowerCase(apb)) {
            next = (char)('a' + (apb - 'a' + 2) % 26);  // 소문자 범위에서 순환
        } else if (Character.isUpperCase(apb)) {
            next = (char)('A' + (apb - 'A' + 2) % 26);  // 대문자 범위에서 순환
        } else {
            next = apb; // 알파벳이 아니면 그대로 출력
        }
        System.out.println(next);
    }
}

