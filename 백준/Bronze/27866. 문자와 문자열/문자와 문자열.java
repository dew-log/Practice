import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next(); // 단어 입력받음
        if (S.length() > 1000) {   // 조건 검증
            return;
        }

        int i = sc.nextInt(); // 정수 입력받음
        if (i < 1 || i > S.length()) {
            return;
        }

        char[] word = S.toCharArray(); // 문자열 S를 문자 배열로 변환

        for (int j = 0; j < word.length; j++) { // 변환된 word를 순회하는 반복문
            if (j == (i - 1)) { // index가 입력받은 숫자와 같다면
                System.out.print(word[j]);
            }
        }
    }
}