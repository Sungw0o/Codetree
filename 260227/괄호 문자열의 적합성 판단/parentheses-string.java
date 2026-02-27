
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
	
	private static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[] arr = br.readLine().toCharArray();
		
		Stack<Character> stack =  new Stack<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == '(') {
				stack.push(arr[i]);
			}
			else {
				stack.pop();
			}
		}
		
		String ans = stack.isEmpty() ? "Yes" : "No";
		
		System.out.println(ans);
		
		
		//System.out.println(sb);
		br.close();
	}
}
