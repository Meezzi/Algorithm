import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int cnt = 0;
        boolean[] prime = new boolean[n+1];

        for(int i=2; i<=n; i++) {
            for(int j=1; i*j<=n; j++) {
                if(prime[i*j]) continue;

                prime[i*j] = true;
                cnt++;

                if(cnt==k) {
                    System.out.println(i*j);
                    break;
                }
            }
        }
    }
}