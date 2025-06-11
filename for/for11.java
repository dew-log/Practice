/*[문제 7] 별로 가로 5칸 × 세로 3칸짜리 사각형 만들기
요구사항
for문을 두 번 중첩해서 사용하기
별 기호 *를 사용해서
가로 5칸, 세로 3줄의 사각형 만들기
 */
public class for11 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println("*");
            for(int j = 0; j < 3; j++){
                System.out.print("*");
            }
        }
    }
}
