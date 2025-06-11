import java.util.Scanner;

/* 4. 알파벳 시저 암호
알파벳 하나를 입력받아, 그 다음 알파벳을 출력하시오. Z는 A로, z는 a로 돌아감.
입력: a
출력: b

입력: Z
출력: A
*/
public class text04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);  // 알파벳 한 글자 입력

        char next;

        if (ch == 'z') {
            next = 'a';
        } else if (ch == 'Z') {
            next = 'A';
        } else {
            next = (char)(ch + 1);
        }
        System.out.println(next);
    }
}
