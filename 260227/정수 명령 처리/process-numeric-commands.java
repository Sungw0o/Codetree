import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위한 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 빠른 출력을 모아서 하기 위한 StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        
        // 첫 번째 줄에 명령어의 수(N)가 주어진다고 가정합니다.
        int n = Integer.parseInt(br.readLine());
        
        // 자바에서 제공하는 Stack 클래스 활용
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            // 공백을 기준으로 문자열을 분리하기 위해 StringTokenizer 사용
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            
            switch (command) {
                case "push":
                    // push A: 다음 토큰(정수)을 읽어서 스택에 넣음
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                    
                case "pop":
                    // pop: 비어있으면 -1, 아니면 맨 위 정수 추출 및 출력
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                    
                case "size":
                    // size: 스택의 크기 출력
                    sb.append(stack.size()).append("\n");
                    break;
                    
                case "empty":
                    // empty: 비어있으면 1, 아니면 0 출력
                    if (stack.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                    
                case "top":
                    // top: 비어있으면 -1, 아니면 맨 위 정수 확인 (제거 X)
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
            }
        }
        
        // 모아둔 출력 결과물을 한 번에 출력
        System.out.print(sb);
    }
}