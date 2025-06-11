import java.util.Scanner;

/* 5. 문자열 내 알파벳 개수 세기
문자열에 포함된 소문자/대문자/숫자/기타 문자 개수를 출력하시오.
입력: AaB!9*
출력:
대문자: 2
소문자: 1
숫자: 1
기타: 2
*/
public class text05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int upper = 0;
        int lower = 0;
        int number = 0;
        int temp = 0;

        for(int i=0; i<text.length(); i++){         // 순환
            char ch = text.charAt(i);               // 한글자씩 뽑음

            if (Character.isUpperCase(ch)){         // 대문자인지 확인
                upper++;
            }
            if (Character.isLowerCase(ch)) {        // 소문자인지 확인
                lower++;
            }
            if (Character.isDigit(ch)){             // 숫자인지 확인
                number++;
            }
            if(!Character.isLowerCase(ch) && !Character.isUpperCase(ch) && !Character.isDigit(ch)){
                temp++;
            }
        }
        System.out.println("대문자 : " + upper);
        System.out.println("소문자 : " + lower);
        System.out.println("숫자 : " + number);
        System.out.println("기타 : " + temp);
    }
}
