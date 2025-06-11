/* 나이를 입력받아 조건에 맞게 출력하기
나이를 여러 번 입력 받아 등급을 출력하고 , 음수를 입력하면 반복을 종료한다*/
import java.util.Scanner;

public class while01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너입력

        int num = 0;

        while(true){
            System.out.print("나이를 입력하세요 >> ");
            int age = sc.nextInt();
            sc.nextLine();

            if (age < 0){
                System.out.println("입력을 종료합니다.");
            break;
            }

            if ( age >= 0 && age <= 7){
                System.out.println("유아입니다");
            }
            else if ( age >= 8 && age <= 13 ){
                System.out.println("초등학생입니다");
            }
            else if ( age >= 14 && age <= 16 ){
                System.out.println("중학생입니다");
            }
            else if ( age >= 17 && age <= 19 ){
                System.out.println("고등학생입니다");
            }
            else {
                System.out.println("성인입니다");
            }
        }
    }
}
