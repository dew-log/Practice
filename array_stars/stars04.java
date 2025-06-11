/* [2단계] 계단형 별 출력
*           i=0     j=0
**          i=1     j=0,1
***         i=2     j=0,1,2
****
*****
*/

public class stars04 {
    public static void main(String[] args) {
        String stars[];
        stars = new String[]{"*","*","*","*","*"};

        for(int i = 0; i < stars.length; i++){
            for(int j = 0; j < stars.length; j++){
                if(i>=j){
                    System.out.print(stars[j]);
                }
            }
            System.out.println();
        }
    }
}
