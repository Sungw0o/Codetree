import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        if (line != null) {
            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());

            for (int i = 1; i <= 5; i++) {
                sb.append(n * i).append(" ");
            }
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}