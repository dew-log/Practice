/*문제 2. **배열에 사용자 입력값 저장하기**
사용자로부터 정수 5개를 입력받아 배열에 저장한 뒤,
**역순으로 출력하세요.**
입력: `3 7 9 1 5`
출력: `5 1 9 7 3`
*/
public class Array02 {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5];
        numbers = new int[] {3,7,9,1,5};

        for(int i = numbers.length -1 ; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}
