import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int gender = sc.nextInt();
        int age = sc.nextInt();

        if (gender == 0) { // 남자일 때
            bw.write(age >= 19 ? "MAN" : "BOY");
        } else { // 여자일 때
            bw.write(age >= 19 ? "WOMAN" : "GIRL");
        }

        bw.flush();
        bw.close();
        sc.close();
    }
}