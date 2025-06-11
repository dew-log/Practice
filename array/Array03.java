/*
문제: 1
정수 배열 `nums`가 주어집니다. 이 배열의 모든 원소의 합을 출력하세요.

입력 예:
nums = {1, 2, 3, 4, 5}

출력 예:
15
*/
public class Array03 {
    public static void main(String[] args) {

        int[] nums;
        int sum = 0;

        nums = new int[] {1, 2, 3, 4, 5};       // numbers = new int[5]; 생략가능

        for (int i = 0; i < nums.length; i++) {
            
            // sum += i;
            sum += nums[i];
        }
        System.out.println("합계 : " + sum );
    }
}
