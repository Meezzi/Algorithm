import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] aNum = new int[n+1];
        st = new StringTokenizer(br.readLine());

        for(int i=1; i<=n; i++) {
            
            aNum[i] = aNum[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(aNum[b] - aNum[a-1]);
        }


    }
}