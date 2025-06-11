/* [4단계] 가운데 정렬된 피라미드
    *             4 1 4
   ***            3 3 3
  *****           2 5 2
 *******          1 7 1
*********         0 9 0         
별이 정중앙 기준으로 퍼지는 삼각형.
*/

public class stars06 {
    public static void main(String[] args) {
        String stars[];         // 선언
        stars = new String[] {"*", "*", "*", "*", "*", "*", "*", "*", "*"};  // 생성 및 입력

        for(int i = 0; i < 5; i++) {      // 반복문 생성 (세로행 줄 갯수)
            for(int j = 0; j < stars.length; j++) {  // 반복문 생성 (별)
                if (j <= stars.length+1) {
                    System.out.print(stars[j]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
