/* ### [문제 1] 1부터 100까지 **홀수**만 더해서 출력하기
- `짝수` 대신 `홀수` 조건으로 바꿔봐 (`i % 2 != 0`)
- 최종 합계를 `System.out.println()`으로 출력 */

public class for05 {
    public static void main(String[] args) {
        int sum = 0;                                // 누적 합계 정의

        for ( int i = 1; i <= 100; i++ ){                   // for문 조건생성
            if ( i % 2 == 1 ){                              // 만약 홀수라며ㅑㄴ?
                sum += i;                                  // 누적합계 구하는 법
            }
        }
    System.out.println("최종합계 : " +sum ) ;      // 출력
    }
}
