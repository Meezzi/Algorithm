import java.io.*;
import java.util.*;

class Main {
    public static boolean[] prime = new boolean[246913];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        isPrime();

        while(true) {
            int a = Integer.parseInt(br.readLine());
            int cnt=0;
            if(a==0) break;

            for(int i=a+1; i<=2*a; i++) {
                if(!prime[i]) cnt++;
            }

            System.out.println(cnt);
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