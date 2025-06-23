import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();       // 정수 N개로 이루어진
        int X = sc.nextInt();       // 정수 X와,
        int[] A = new int[N];       // 수열 A가 주어짐

        for(int i=0; i<N; i++){     // 수열 a를 이루는
            A[i] = sc.nextInt();    // 정수 n개 입력받기
            if (A[i]<X){            // X보다 작은 수를
                int result = A[i];  // 값에 저장하고
                System.out.print(result + " ");   // 출력
            }
        }
    }
}

