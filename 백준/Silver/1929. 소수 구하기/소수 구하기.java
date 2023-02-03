import java.util.*;
import java.io.*;

class Main {
    public static boolean[] prime;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        prime = new boolean[K+1];

        get_prime();
        prime[0] = true;
        prime[1] = true;

        int cnt=0;

        for(int i=N; i<=K; i++) {
            if(!prime[i])
                System.out.println(i);
        }
    }

    static void get_prime() {
        for(int i=2; i<=Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j=i*i; j<prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
}