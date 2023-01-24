import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] arr = new long[n+1];
        long[] res = new long[m+1];
        long cnt = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<=n; i++) {
            int remainder = (int)(arr[i]%m);
            if(remainder==0) cnt++;
            res[remainder]++;
        }

        for(int i=0; i<=m; i++) {
            if(res[i] > 1) {
                cnt = cnt + (res[i] * (res[i]-1))/2;
            }
        }
        System.out.println(cnt);

    }
}