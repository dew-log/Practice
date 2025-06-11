public class stars01 {
    public static void main(String[] args) {
        String stars[]; //선언
        stars = new String[5]; //생성
        stars = new String[] {"*", "*", "*", "*", "*"}; //입력

        for(int i = 0; i < stars.length; i++){
            for(int j = 0; j < stars.length; j++){
                if(i>=j){
                    System.out.print(stars[i]);
                }
            }
            System.out.println();
        }
    }
}
