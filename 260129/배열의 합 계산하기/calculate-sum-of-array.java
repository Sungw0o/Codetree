import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] A = {3, 1, 4, 5, 9};

        int sum = IntStream.of(1, 3, 4)
                .map(index -> A[index])
                .sum();

        System.out.println(sum);
    }
}