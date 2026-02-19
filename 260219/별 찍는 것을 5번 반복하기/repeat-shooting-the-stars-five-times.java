import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        for(int i = 0 ; i < 5; i++){
            print();
        }

        br.close();
    }

    public static void print(){

        System.out.println("**********");
    }
}