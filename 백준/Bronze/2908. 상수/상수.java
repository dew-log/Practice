import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A < 100 || A > 999) {
            return;
        }
        if (B < 100 || B > 999) {
            return;
        }
        if (String.valueOf(A).contains("0")) {
            return;
        }
        if (String.valueOf(B).contains("0")) {
            return;
        }
        if (A == B) {
            return;
        }
        String strA = Integer.toString(A); // 문자 변환
        String strB = Integer.toString(B);
        char[] tempA = strA.toCharArray();
        char[] tempB = strB.toCharArray();
        String reverseA = "";
        String reverseB = "";

        for (int i = tempA.length - 1; i >= 0; i--) {
            reverseA += tempA[i];
        }
        for (int i = tempB.length - 1; i >= 0; i--) {
            reverseB += tempB[i];
        }

        A = Integer.parseInt(reverseA);
        B = Integer.parseInt(reverseB);

        if (A < B) {
            System.out.print(B);// 출력
        } else {
            System.out.print(A);
        }
    }
}