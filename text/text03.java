import java.util.Scanner;

/* 3. 대문자만 출력
문자열에서 대문자인 문자만 출력하시오.
입력: aBcDeFgHi
출력: BDFH
*/
public class text03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for(int i=0; i<text.length(); i++){     // 글자 수만큼 반복하면서, 한 글자씩 꺼내서 확인
            char ch = text.charAt(i);           // i번째 글자를 꺼내서 ch에 저장
            if (Character.isUpperCase(ch)) {    // 그 글자가 대문자인지 확인 (예: 'A' ~ 'Z')
                System.out.print(ch);           // 대문자라면 화면에 출력 (줄바꿈 없이 옆에 이어서 출력)
            }
        }
    }
}
