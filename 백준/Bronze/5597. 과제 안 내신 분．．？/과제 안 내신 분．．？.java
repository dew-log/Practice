import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[30];
        int[] arr = new int[28];

        for (int i = 0; i < n.length; i++) { // 전체 학생들의 출석번호
            n[i] = i + 1; // 1번부터 30번까지 입력
        }

        for (int i = 0; i < arr.length; i++) { // 과제를 제출한 학생들의 출석번호
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n.length; i++) { // 전체를 돌며
            boolean s = false;  // 아직 제출한 사람이 없기 때문에 기본값을 false로 줌
            for (int j = 0; j < arr.length; j++) {
                if (n[i] == arr[j]) { // 제출한 학생들의 출석번호 비교
                    s = true; // 제출 시 트루로 바꿈
                    break;
                }
            }
            if (!s) {
                System.out.println(n[i]); // 제출하지 않은 학생들
            }
        }
    }
}
