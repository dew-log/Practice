import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next(); // 단어 입력받음
        if (word.length() > 100) { // 조건 검증
            return;
        }

        int count = 0; // 글자 수를 누적시킬 변수 생성

        for (int i=0; i<word.length(); i++){    // 워드의 글자 수만큼 반복
            count++; // 글자 수 만큼 반복할 때마다 count 증가
        }
        System.out.print(count);
    }
}