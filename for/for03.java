// for문을 이용해서 1부터 100까지 중에서 짝수만 출력하기

public class for03 {
    public static void main(String[] args) {
        for( int i = 1; i <= 100; i++)
            if ( i % 2 == 0 ){
                System.out.println(i);
            }
    }
}
