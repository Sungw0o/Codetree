import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();

        for (int i = 0; i < 8; i++) {
            sb.append(s);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}