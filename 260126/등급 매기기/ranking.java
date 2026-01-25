import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        if (n >= 90) {
            sb.append("A");
        } else if (n >= 80) {
            sb.append("B");
        } else if (n >= 70) {
            sb.append("C");
        } else if (n >= 60) {
            sb.append("D");
        } else {
            sb.append("F");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}