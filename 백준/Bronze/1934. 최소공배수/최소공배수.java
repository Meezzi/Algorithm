import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println((a*b)/gcd(a, b));
        }
    }

    public static int gcd(int a, int b) {
        if(a%b==0) {
            return b;
        }
        return gcd(b, a%b);
    }
}