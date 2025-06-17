import java.util.Scanner;
/*
첫째 줄에는 영수증에 적힌 총 금액 x가 주어진다.
둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 n이 주어진다.
이후 n개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes, 일치하지 않는다면 No를 출력한다.
입력 예시 :                 출력 예시 :
260000                     Yes
4
20000 5
30000 2
10000 6
5000 8
총 금액은 20000 × 5 + 30000 × 2 + 10000 × 6 + 5000 × 8 = 260000원이다.
이는 영수증에 적힌 총 금액인 260000원과 일치한다.
*/
public class joon25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();   // 총 금액
        int n = sc.nextInt();       // 물건의 종류 개수
        int mul = 0;
        int sum = 0;

        for(int i=0; i<n; i++) {    // 종류 개수만큼 반복
            int a = sc.nextInt();   // 각 물건의 가격
            int b = sc.nextInt();   // 각 물건의 개수
            mul = a*b;
            sum += mul;
        }
        if(sum == price){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}