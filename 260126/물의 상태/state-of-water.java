import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        if(a < 0){
            sb.append("ice");
        }
        else if(a >= 100){
            sb.append("vapor");
        }
        else{
            sb.append("water");
        }

        System.out.println(sb);

        br.close();
    }
}
