/*
첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다.
둘째 줄에 세준이의 현재 성적이 주어진다.
이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next(); // 단어 입력받음
        if (S.length()>1000){   // 조건 검증
            return;
        }

        int i = sc.nextInt(); // 정수 입력받음
        if (i < 1 || i > S.length()){
            return;
        }

        char temp = S.charAt(i-1);  // 문자열 하나만 꺼내기
        System.out.print(temp);

    }
}
