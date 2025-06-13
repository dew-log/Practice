import java.util.Scanner;  // 사용자 입력을 받기 위해 Scanner 클래스를 사용
// 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

// 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
// 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
// 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
// 입력 예시 : 3 3 6 - 출력 예시 : 1300
// 입력 예시 : 2 2 2 - 출력 예시 : 12000
// 입력 예시 : 6 2 5 - 출력 예시 : 600
public class joon2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 사용자로부터 입력을 받기 위한 Scanner 객체 생성

        int dice1 = sc.nextInt();  // 첫 번째 주사위 숫자 입력
        int dice2 = sc.nextInt();  // 두 번째 주사위 숫자 입력
        int dice3 = sc.nextInt();  // 세 번째 주사위 숫자 입력
        int result = 0;            // 계산 결과를 저장할 변수 초기화

        // 세 주사위의 숫자가 모두 같을 경우
        if(dice1 == dice2 && dice2 == dice3){
            // 같은 숫자가 3개이므로 10000 + (같은 숫자 × 1000) 출력
            System.out.println(10000 + dice1 * 1000);
        }
        // 주사위 숫자 중 2개가 같고 1개는 다른 경우
        else if(dice1 == dice2 || dice2 == dice3 || dice1 == dice3){
            // 어떤 숫자가 같은지 확인하고 result에 저장
            if(dice1 == dice2){
                result = dice1;
            }else if(dice2 == dice3){
                result = dice2;
            }else{
                result = dice3;
            }
            // 같은 숫자가 2개이므로 1000 + (같은 숫자 × 100) 출력
            System.out.println(1000 + result * 100);
        }
        // 세 숫자가 모두 다를 경우
        else{
            // 가장 큰 숫자를 찾기 위해 먼저 result에 dice1 값을 저장
            result = dice1;
            // dice2가 result 보다 크면 result를 dice2로 바꿈
            if(dice2 > result){
                result = dice2;
            }
            // dice3이 result 보다 크면 result를 dice3으로 바꿈
            if(dice3 > result){
                result = dice3;
            }
            // 가장 큰 숫자 × 100 출력
            System.out.println(result * 100);
        }
    }
}
