import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(countOperations(N));
	}
	
	public static int countOperations(int n) {
		
		if (n == 1) {
			return 0;
		}
		
		if (n % 2 == 0) {
			return 1 + countOperations(n / 2);
		} 
		else {
			return 1 + countOperations(n / 3);
		}
	}
}