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

        // A와 B 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();

        // B부터 A까지 1씩 감소하며 StringBuilder에 담기
        for (int i = b; i >= a; i--) {
            sb.append(i).append(" ");
        }

        // 결과 출력 및 스트림 닫기
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        sc.close();
    }
}