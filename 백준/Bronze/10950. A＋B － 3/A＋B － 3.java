import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t; i++){         // t번 반복
            int a = sc.nextInt();       // a값 입력
            int b = sc.nextInt();       // b값 입력
            System.out.println(a+b);
        }
    }
}
