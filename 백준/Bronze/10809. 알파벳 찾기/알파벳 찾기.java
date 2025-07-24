import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] result = new int[26];   // alphabet의 배열 생성
        for (int i = 0; i < result.length; i++) { // 알파벳을 순회하는 반복문 생성
            result[i] = -1;   // 알파벳의 값을 -1로 초기화
        }

        String word = sc.next(); // 단어 word 선언
        if (word.length() > 100) { // 워드의 길이가 100을 넘으면 리턴
            return;
        }

        for (int i = 0; i < word.length(); i++) { // word를 순회할 배열 생성
            char ch = word.charAt(i); // word를 잘라서 추출할 임시 변수 생성
            int index = ch - 'a'; // 정수형 변수에 index 번호 값을 저장

            if (result[index] == -1) {
                result[index] = i; // 첫 등장 위치 저장
            }
        }

        for (int i = 0; i < result.length; i++) {// 결과 값을 순회할 배열 생성
            System.out.print(result[i] + " ");
        }
    }
}