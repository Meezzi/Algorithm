import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i=1;

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            if(l==0 && p==0 && v==0) break;
            int res = 0;

            res = l*(v/p);
            if(l<(v%p)) res+=l;
            else res+=(v%p);
            System.out.println("Case " + i + ": " + res);
            i+=1;
        }
    }
}