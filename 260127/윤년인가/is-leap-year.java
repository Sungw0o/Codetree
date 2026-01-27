import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            sb.append("true");
        } else {
            sb.append("false");
        }
        
        System.out.println(sb.toString());
    }
}