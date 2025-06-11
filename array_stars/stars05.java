/* [3단계] 역계단형 별 출력
    *       i=0     j=4
   **       i=1     j=3,4
  ***       i=2     j=2,3,4
 ****       2 =< 2,3,4
*****
*/

import java.util.*; 

public class stars05 {
    public static void main(String[] args) {
        String stars[]; //선언
        stars = new String[5]; //생성
        stars = new String[] {"*", "*", "*", "*", "*"}; //입력

        // 반복문 생성 
        for(int i = 0; i < stars.length; i++){          // 줄번호
            for(int j = 0; j < stars.length; j++){      // 반복문 인덱스
                if(j < stars.length-i-1){
                    System.out.print(" ");
                }else{
                    System.out.print(stars[j]);
                }
            }
            System.out.println();   // 줄넘김
        }
    }
}