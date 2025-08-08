import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine(); // 사용자에게 입력받기
        if (word.length() > 1000000) { // 조건 검증
            return;
        }
        String[] temp = word.split(" ");
        int count = 0;


        for (int i = 0; i < temp.length; i++) { // word를 순회하는 반복문 생성
            if (!temp[i].equals("")) { // temp[i]가 빈 문자열이 아닐 때만 실행
                count++;
            }
        }
        System.out.print(count);
    }
}
