package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	private static int N;
	private static ArrayList<Integer> arr = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		while(N --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			int num = 0;
			switch(command) {
			case "push_back" : {
				num = Integer.parseInt(st.nextToken());
				arr.add(num);
				break;
				}
			case "get" : {
				num = Integer.parseInt(st.nextToken());
				sb.append(arr.get(num)).append("\n");
				break;
			}
			case "size" : {
				sb.append(arr.size()).append("\n");
				break;
			}
			case "pop_back" :{
				if (!arr.isEmpty()) {
					arr.remove(arr.size() - 1);
				}
				break;
			}
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}