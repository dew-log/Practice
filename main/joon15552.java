import java.io.*;
/* Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용하여 문제 풀이
BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

입력 예시 :                     출력 예시 :
5
1 1                            2
12 34                          46
5 500                          505
40 60                          100
1000 1000                      2000
 */
public class joon15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            bw.write((a + b) + "\n");
        }
        bw.flush();
    }
}
