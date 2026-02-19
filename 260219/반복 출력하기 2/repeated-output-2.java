import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        print(N);
        br.close();


    }

    public static void print(int n){
        System.out.println("HelloWorld");
        print(n-1);
    }
}