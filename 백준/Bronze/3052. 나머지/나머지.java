import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];    // 수 10개를 입력받을 배열 생성
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) { // 배열을 순회할 반복문 생성
            arr[i] = sc.nextInt(); // 배열의 값을 넣어줄 구문
            arr[i] = arr[i] % 42; // 배열을 42로 나누는 식
            set.add(arr[i]);
        }
        System.out.print(set.size());
    }
}
