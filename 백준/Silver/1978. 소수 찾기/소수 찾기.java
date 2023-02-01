import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int cnt=0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while(st.hasMoreTokens()) {
            boolean prime = true;

            int n = Integer.parseInt(st.nextToken());

            if(n==1) continue;

            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n%i==0) {
                    prime=false;
                    break;
                }
            }

            if(prime) cnt++;

        }
        System.out.println(cnt);
    }
}