/*Q. 숫자를 입력 받아서 짝수면 "짝수입니다", 홀수면 "홀수입니다"라고 출력하세요
if, else, Scanner 사용
짝수: 2로 나누어 떨어지는 수 → num % 2 == 0
*/
import java.util.Scanner;

public class if01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 >> ");
        int num = sc.nextInt();

        if ( num%2 ==0 ){
            System.out.println("짝수입니다");
        }
        else {
            System.out.println("홀수입니다");
        }
    }
}
