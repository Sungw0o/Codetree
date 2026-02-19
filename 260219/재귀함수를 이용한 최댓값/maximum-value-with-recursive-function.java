import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. 입력 받기
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 재귀 함수 호출 (0번 인덱스부터 시작)
        System.out.println(findMax(0, N));
    }

    // 최댓값을 찾는 재귀 함수
    public static int findMax(int index, int n) {
        // 종료 조건: 마지막 요소에 도달했을 때 그 값을 반환
        if (index == n - 1) {
            return arr[index];
        }

        // 재귀 호출: 현재 값과 '그 다음부터 끝까지 중 최댓값'을 비교
        // Math.max(현재 값, 나머지 중 최댓값)
        return Math.max(arr[index], findMax(index + 1, n));
    }
}