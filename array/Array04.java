/*
문제: 2
문자열 배열 `words`가 주어집니다. 이 배열을 거꾸로 출력하세요.

입력 예:
words = {"Java", "is", "fun"}

출력 예:
fun
is
Java
*/
public class Array04 {
    public static void main(String[] args) {
        String[] words;
        words = new String[] {"Java", "is", "fun"};

        for(int i = words.length-1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}
