// 감정 배열에 "기쁨", "슬픔", "분노", "놀람", "평온"이 담겨 있어.
// 이 중 "분노"가 몇 번째 위치에 있는지 출력해줘.
// 단, 0번부터 센다!
public class test01 {
    public static void main(String[] args) {
        String[] emo = {"기쁨","슬픔","분노","놀람","평온"};

        for (int i=0; i< emo.length; i++){
            if (emo[i].equals("분노")) {
                System.out.print(i);
                break;
            }
        }
    }
}
