import java.util.Scanner;

// 감정을 문자열로 입력받아서, 해당 감정에 어울리는 위로 메시지를 return 하는 메서드를 만들어줘.
// 조건:
// "지쳤어" → "괜찮아, 오늘도 수고했어"
// "무기력해" → "조금 천천히 가도 돼"
// 그 외 → "내가 곁에 있어"
public class test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String emo = sc.nextLine();
        }
    }

    public static String comfort(String emo){
        switch (emo){
            case "지쳤어":
                System.out.println("괜찮아, 오늘도 수고했어");
                break;
            case "무기력해":
                System.out.println("조금 천천히 가도 돼");
                break;
            default:
                System.out.println("내가 곁에 있어");
                break;

    }
}
