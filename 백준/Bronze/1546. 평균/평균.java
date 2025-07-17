import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 시험 본 과목의 개수
        if (N > 1000) { // 조건 검증을 위한 코드
            return;
        }
        double M = Integer.MIN_VALUE; // 점수 최댓값
        double sum = 0; // 점수들의 합을 누적시킬 변수
        double[] score = new double[N]; // 점수를 입력 받을 배열

        for (int i = 0; i < N; i++) {   // 점수 배열을 순회할 반복문
            score[i] = sc.nextInt();    // 점수 배열의 값 채우기
            if (score[i] > 100 || score[i] < 0) { // 조건 검증을 위한 코드
                return;
            }
            if (score[i] > M) {    // 점수가 최댓값보다 크면
                M = score[i];   // 최댓값 변수에 점수 저장
            }
        }
        for (int j = 0; j < N; j++) {
            score[j] = score[j] / M * 100; // 점수 계산
            sum += score[j];
        }
        sum = sum / N;
        System.out.printf("%.2f", sum);
    }
}
