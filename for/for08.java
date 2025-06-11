/*[문제 5] 1부터 100까지 짝수 합 / 홀수 합 따로 계산

for문을 사용해서
1부터 100까지 반복하면서
짝수는 짝수끼리, 홀수는 홀수끼리 따로 더하기
마지막에 두 합을 따로 출력 2550 2500이 나오면 성공
 */
public class for08 {
    public static void main(String[] args) {
        // 정수 선언
        int num = 1;
        int sum1 = 0;
        int sum2 = 0;
        
        // 반복문 생성
        for( int i = 0; i < 100; i++){  
            // 홀수일 때
            if (num % 2 == 1){  
                sum1 += num;  
                num++;
            }   
            // 짝수일 때
            else if (num % 2 == 0){
                sum2 += num;
                num++;
            }
        }
        System.out.println("홀수의 합계 : " + sum1);
        System.out.println("짝수의 합계 : " + sum2);
    }
}
