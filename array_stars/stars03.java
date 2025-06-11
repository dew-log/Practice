/* [1단계] 정사각형 별 출력
*****   i=0     j=0,1,2,3,4
*****   i=1     j=0,1,2,3,4
*****   i=2     j=0,1,2,3,4
*****   i=3     j=0,1,2,3,4
*****   i=4     j=0,1,2,3,4
 */

public class stars03 {
    public static void main(String[] args) {
        String stars[];
        stars = new String[5];
        stars = new String[] {"*", "*", "*", "*", "*"};

        for(int i = 0; i < stars.length; i++){      // 
            for(int j = 0; j < stars.length; j++){
                System.out.print(stars[j]);
            }
            System.out.println();
        }
    }
}
