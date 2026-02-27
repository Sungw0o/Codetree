import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입출력을 위한 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 첫 번째 줄: 명령어의 수 (N)
        int n = Integer.parseInt(br.readLine());
        
        // 큐 구현체로 LinkedList를 사용 (Deque 인터페이스로 선언)
        Deque<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            
            switch (command) {
                case "push":
                    // push X: 큐의 맨 뒤에 정수 X를 추가
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                    
                case "pop":
                    // pop: 큐가 비어있으면 -1, 아니면 맨 앞의 정수를 빼고 출력
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.poll()).append("\n");
                    }
                    break;
                    
                case "size":
                    // size: 큐에 들어있는 정수의 개수 출력
                    sb.append(queue.size()).append("\n");
                    break;
                    
                case "empty":
                    // empty: 큐가 비어있으면 1, 아니면 0 출력
                    if (queue.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                    
                case "front":
                    // front: 큐가 비어있으면 -1, 아니면 맨 앞의 정수를 출력 (제거 X)
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.peekFirst()).append("\n");
                    }
                    break;
                    
                case "back":
                    // (참고) back: 큐가 비어있으면 -1, 아니면 맨 뒤의 정수를 출력 (제거 X)
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.peekLast()).append("\n");
                    }
                    break;
            }
        }
        
        // 모아둔 결과 한 번에 출력
        System.out.print(sb);
        br.close();
    }
}