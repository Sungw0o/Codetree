public class Main {
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for (int i = 5; i <= 17; i++) {
            sb.append(i).append(" ");
        }

        bw.write(sb);
        bw.flush();
        bw.close();
    }
}