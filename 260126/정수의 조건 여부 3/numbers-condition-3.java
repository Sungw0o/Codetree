import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = sc.nextInt();

        if (a % 13 == 0 || a % 19 == 0) {
            bw.write("True");
        } else {
            bw.write("False");
        }

        bw.flush();
        bw.close();
        sc.close();
    }
}