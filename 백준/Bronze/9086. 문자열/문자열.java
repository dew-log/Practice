import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine()); // 입력받을 테스트 케이스의 변수
        if (T < 1 || T > 10) { // T가 정수가 아니거나 10 초과
            return;
        }

        String[] word = new String[T]; // 문자 배열 생성

        for (int i = 0; i < T; i++) { // 배열 안을 채울 반복문 생성
            word[i] = sc.nextLine();

            if (word[i].length() > 1000) { // 1000글자 이상이면 종료 시킴
                return;
            }
        }
        for (int j = 0; j < T; j++) { // 알파벳 출력할 반복문 생성
            char stemp = word[j].charAt(0); // 배열 알파벳 저장하고 꺼내기
            char ltemp = word[j].charAt(word[j].length() - 1); // 마지막 알파벳 저장하고 꺼내기
            System.out.print(stemp);
            System.out.print(ltemp);
            System.out.println();
        }
    }
}
