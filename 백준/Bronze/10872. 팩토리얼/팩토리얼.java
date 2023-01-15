import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int res = 1;
        
        for(int i=1; i<=a; i++) {
            res *= i;
        }
        System.out.print(res);

    }
}