/*- `for`문을 사용해서
- 1부터 100까지 숫자 중 **짝수만 골라서**
- 그 값들을 **모두 더한 후**, 마지막에 합계를 출력하기 */

public class for02 {
    public static void main(String[] args) {
        int sum = 0;

        for ( int i = 1; i <= 100; i++ ){       // 반복문 생성 ( i = 1, i(1)=100보다 크거나 같다, i는 1씩 증가)
            if ( i % 2 == 0 ){                  // 짝수일 때
                sum += i;                       // 누적합ㅂ
            }
        }
    System.out.println("합계 : " + sum);                    // 합계 저장 출력
    }
}
