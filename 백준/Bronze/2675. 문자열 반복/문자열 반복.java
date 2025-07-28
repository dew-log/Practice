import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 T 생성
        if (T < 1 || T > 20) { //
            return;
        }

        sc.nextLine(); // 버퍼제거

        for (int i = 0; i < T; i++) { // T를 순회하는 배열 생성
            String[] temp = sc.nextLine().split(" "); // 임시 배열을 생성하여 스플릿으로 쪼갬
            int R = Integer.parseInt(temp[0]);
            // R을 temp[0]을 앞서 입력받은 예시를 기준으로 공백 앞 글자만 저장함.
            // 예시로 3 ABC를 입력 받았다면, 공백 기준 앞에 있는 3이 반복 횟수 R이 됨
            if (R < 1 || R > 8) { // R에 대한 조건 검증
                return;
            }
            String word = temp[1]; // 같은 맥락으로 temp[1]에 word만 저장
            if (word == null || word.length() < 1 || word.length() > 20 || // word에 대한 검증
                    !word.matches("[0-9A-Z$%*+\\-./:]+")) { // 알파뉴메릭 외엔 허용하지 않음
                return;
            }

            char[] S = word.toCharArray(); // 문자 배열로 변환
            for (int j = 0; j < S.length; j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(S[j]);
                }
            }
            System.out.println();
        }
    }
}