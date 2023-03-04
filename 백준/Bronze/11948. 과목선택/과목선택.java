import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        int min = Math.min(a, (Math.min(b, Math.min(c, d))));
        int sum = a+b+c+d-min;
        min = Math.min(e, f);
        sum = sum + e+f-min;

        System.out.print(sum);

    }
}