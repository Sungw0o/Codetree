import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private static BufferedReader br;
	private static BufferedWriter bw; 
	private static StringTokenizer st;
	private static StringBuilder sb;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		print1ToN(N);
		
		sb.append("\n"); // 줄바꿈
		
		printNTo1(N);
		
		System.out.println(sb);
	}
	
	public static void print1ToN(int n) {
		if (n == 0) return; // 종료 조건
		
		print1ToN(n - 1); 
		sb.append(n).append(" ");
	}
	
	public static void printNTo1(int n) {
		if (n == 0) return; 
		
		sb.append(n).append(" "); 
		printNTo1(n - 1); 
	}
}