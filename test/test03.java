import java.util.Scanner;

// 사용자에게 감정 3개를 입력받아 배열에 저장하고 출력해줘.
// 예: 기쁨, 당황, 졸림
public class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] emo = new String[3];

        for(int i=0; i< emo.length; i++){
            emo[i] = sc.nextLine();
            System.out.println(emo[i]);
        }
    }
}
