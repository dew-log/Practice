import java.util.Scanner;

/* 1. 문자열 뒤집기
입력받은 문자열을 거꾸로 출력하시오.
입력: Hello
출력: olleH
*/
public class text01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        // StringBuilder = 블록 조립 세트
        // .reverse() = 블록을 뒤집는 기능
        // .toString() = 완성된 블록을 글자로 변환
        System.out.print(new StringBuilder(text).reverse().toString());
    }
}
