import java.util.Scanner;

/* 6. 대소문자 변환 (기본 복습)
설명 : 문자열이 주어지면 대문자는 소문자로, 소문자는 대문자로 바꿔서 출력해라.
입력 : aBcDeF
출력 : AbCdEf
*/
public class text06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for(int i=0;i<text.length(); i++){
            char ch = text.charAt(i);

            if(Character.isLowerCase(ch)){
                System.out.print(Character.toUpperCase(ch));
            }else{
                System.out.print(Character.toLowerCase(ch));
            }
        }
        System.out.println();
    }
}
