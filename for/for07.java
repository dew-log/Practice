//- **1~100까지 숫자 중 합계가 1000을 넘어가는 최초의 숫자**를 출력하기 / 누적합을 구하면서 `sum > 1000`이 되는 순간의 `i` 출력
public class for07 {
    public static void main(String[] args) {
        int num = 1;                        // 정수 선언
        int sum = 0;

            for( int i = 1; i <= 100; i++ ){           // 반복문 생성

                if (sum <= 1000){
                    sum += i;
                }

                if (sum >= 1000){          // 만약 합계가 1000 이상이라면
                    System.out.print(i);
                    System.out.println( ", 누적합계 : " + sum ); // 출력
                    break;
                }
            }
    }
}
