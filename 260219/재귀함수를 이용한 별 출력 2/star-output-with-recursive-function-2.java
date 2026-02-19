import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private static BufferedReader br;
	private static StringTokenizer st;
	private static StringBuilder sb;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine()); 
		br.close();
		
		print(N);
		System.out.println(sb);
	}
	
	public static void print(int n) {
		
		if(n == 0) return; // 종료 조건
		
		for(int i = 0; i < n; i++) {
			sb.append("*").append(" ");
		}
		sb.append("\n");
		
		print(n-1);
		
		for(int i = 0; i < n; i++) {
			sb.append("*").append(" ");
		}
		sb.append("\n");
	}
}