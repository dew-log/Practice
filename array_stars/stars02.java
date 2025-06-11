/*
*****	i=0 / j=0,1,2,3,4
 ****	i=1 / j=1,2,3,4
  ***	i=2 / j=2,3,4
   **	i=3 / j=3,4
    *	i=4 / j=4
 */

public class stars02 {
    public static void main(String[] args) {
        String stars[]; //선언
        stars = new String[5]; //생성
        stars = new String[] {"*", "*", "*", "*", "*"}; //입력

        // 반복문 생성 
        for(int i = 0; i < stars.length; i++){
            for(int j = 0; j < stars.length; j++){
                if( i <= j) {
                    System.out.print(stars[j]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();   // 줄넘김
        }
    }
}
