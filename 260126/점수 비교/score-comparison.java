import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // A의 점수 입력
        int aMath = sc.nextInt();
        int aEng = sc.nextInt();
        // B의 점수 입력
        int bMath = sc.nextInt();
        int bEng = sc.nextInt();

        // 두 과목 모두 A가 높은지 확인 (논리 연산자 && 사용)
        if (aMath > bMath && aEng > bEng) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
        sc.close();
    }
}