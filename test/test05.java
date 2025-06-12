import java.util.Scanner;

// 숫자 메뉴판 선택기
// 사용자에게 숫자(1~4)를 입력받아, 해당 메뉴를 출력해줘.
// 1 → "김치찌개"
// 2 → "된장찌개"
// 3 → "부대찌개"
// 4 → "물"
// 그 외 → "없는 메뉴입니다"
public class test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("김치찌개");
                break;
            case 2:
                System.out.println("된장찌개");
                break;
            case 3:
                System.out.println("부대찌개");
                break;
            case 4:
                System.out.println("물");
                break;
            default:
                System.out.println("없는 메뉴입니다");
                break;
        }
    }

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
}
