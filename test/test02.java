// 도시락 식판을 2차원 배열로 표현할게.
// "김치", "계란말이", "" (빈칸), "볶음김치"
// 이 식판에는 비어 있는 칸이 몇 개 있는지 찾아서 출력해줘.
public class test02 {
    public static void main(String[] args) {
        String[][] lunchbox = {
                {"김치", "계란말이"},{"","볶음김치"}
        };
        int count = 0;

        for(int i=0; i<lunchbox.length; i++){
            for(int j=0; j< lunchbox[i].length; j++){
                if(lunchbox[i][j].equals("")){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
