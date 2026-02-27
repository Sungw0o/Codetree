import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] arr = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        
        // 올바른 괄호열인지 체크하는 플래그 변수
        boolean isValid = true; 
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '(') {
                stack.push(arr[i]);
            } 
            else if(arr[i] == ')') { // else 대신 확실하게 ')' 일 때로 지정하는 것이 안전합니다.
                if(stack.isEmpty()) {
                    // 스택이 비었는데 닫는 괄호가 나오면 짝이 안 맞는 것!
                    isValid = false;
                    break; // 더 이상 검사할 필요 없으므로 반복문 종료
                }
                stack.pop();
            }
        }
        
        // isValid가 true로 유지되었고, 남은 여는 괄호가 없어야(stack.isEmpty()) 완벽한 짝입니다.
        String ans = (isValid && stack.isEmpty()) ? "Yes" : "No";
        
        System.out.println(ans);
        
        br.close();
    }
}