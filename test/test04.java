import java.util.Scanner;

// 입력된 감정이 다음 중 하나라면 해당 온도를 출력해줘:
// "분노" → 90도
// "기쁨" → 70도
// "슬픔" → 40도
// 그 외 → "측정불가"
public class test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String emo = sc.nextLine();

        switch (emo) {
            case "분노" -> System.out.println("90도");
            case "기쁨" -> System.out.println("70도");
            case "슬픔" -> System.out.println("40도");
            default -> System.out.println("측정불가");
        }
    }
}
