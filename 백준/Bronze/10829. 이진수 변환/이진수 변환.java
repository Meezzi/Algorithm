import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine());

        while(n>0) {
            sb.append(n%2);
            n= n/2;
        }
        System.out.print(sb.reverse());

    }
}