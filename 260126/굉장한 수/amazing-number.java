import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();

        // 조건 1: 홀수 && 3의 배수
        boolean case1 = (n % 2 != 0 && n % 3 == 0);
        // 조건 2: 짝수 && 5의 배수
        boolean case2 = (n % 2 == 0 && n % 5 == 0);

        if (case1 || case2) {
            bw.write("true");
        } else {
            bw.write("false");
        }

        bw.flush();
        bw.close();
        sc.close();
    }
}