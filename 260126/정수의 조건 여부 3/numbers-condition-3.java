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

        int n = sc.nextInt();
        int m = sc.nextInt();

        while (n > 0) {
            sb.append(n).append("\n");
            n /= m;
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        sc.close();
    }
}