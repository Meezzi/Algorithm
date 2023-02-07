import java.io.*;
import java.util.*;

class Main {
    public static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        isPrime();

        int a = Integer.parseInt(br.readLine());
        for(int i=0; i<a; i++) {
            int num = Integer.parseInt(br.readLine());
            int res1 = 0;
            int res2 = 0;
            int min = 10000, abs = 0;

            for(int j=2; j<num; j++) {
                if(prime[j]) continue;

                int res = num-j;
                if(prime[res]) continue;

                abs = Math.abs(res-j);

                if(min>abs) {
                    res1 = j;
                    res2 = res;
                    min = abs;
                }

            }
            
            System.out.println(res1 + " " + res2);
        }

    }

    static void isPrime() {
        prime[0] = prime[1] = true;

        for(int i=2; i<Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;

            for(int j=i*i; j<prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
}