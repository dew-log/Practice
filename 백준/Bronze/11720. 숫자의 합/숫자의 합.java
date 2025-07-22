import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N < 1 || N > 100) {
            return;
        }
        String temp = sc.next();
        int answer = 0;

        for (int i=0; i<N; i++){    // N을 순회하는 반복문 생성
            char ch = temp.charAt(i); // 한 글자씩 잘라내서 임시 변수에 저장
            answer += (ch - '0');     // 합을 더함
        }
        System.out.print(answer); // 출력
    }
}