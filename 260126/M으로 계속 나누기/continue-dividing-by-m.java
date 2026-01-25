import java.util.Scanner;
import java.lang.StringBuilder;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // N과 M 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();

        // N이 0이 되기 전까지 반복
        while (n > 0) {
            sb.append(n).append("\n"); // 현재 N을 StringBuilder에 추가 (줄바꿈 포함)
            n /= m;                   // N을 M으로 나눈 몫으로 갱신
        }

        // 결과 한 번에 출력
        bw.write(sb.toString());
        bw.flush();
        
        // 자원 해제
        bw.close();
        sc.close();
    }
}