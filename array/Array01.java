/* 문제 1. 배열에 숫자 저장하고 출력하기
크기가 5인 int 배열을 만들고,
각각의 원소에 정수 10, 20, 30, 40, 50을 저장한 뒤,
모든 값을 순서대로 출력하세요.
 */
public class Array01 {
    public static void main(String[] args) {

        int[] numbers;
        numbers = new int[5];
        numbers = new int[] {10, 20, 30, 40, 50};

        
        for(int i = 0; i <= 4; i++){
            System.out.println(numbers[i]);
        }
    }
}
