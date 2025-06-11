/*
문제: 3
정수 배열 `nums`가 주어질 때, 모든 원소(배열 안에 있는 값)의 평균을 출력하세요. avg
입력 예:
nums = {5, 10, 15}
출력 예:
10.0
힌트:
- 총합을 구하고 원소 개수로 나누세요.
- 평균은 double 타입으로 계산해야 합니다.
*/
public class Array05 {
    public static void main(String[] args) {

        int[] nums;                         // 선언
        double avg = 0;
        int sum = 0;                        

        nums = new int[] {5, 0, 18};      // 생성, 입력

        for(int i = 0; i < nums.length; i++) {      // 반복문 생성, 조건
            sum += nums[i]; // sum = sum + nums[i]0 1 2
        }
        avg = (double)sum / nums.length;    // sum, nums.length == 정수 / 
        System.out.println("평균 : " + avg);
        // System.out.printf("%.2\n", avg);
    }
}
