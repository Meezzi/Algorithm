import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            int max = -10000;
            int k = Integer.parseInt(br.readLine());
            int[] arr = new int[k+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=k; j++) {
                arr[j] = arr[j-1] + Integer.parseInt(st.nextToken());
            }

            for(int m=k; m>=0; m--) {
                for(int a=1; a<=m; a++) {
                    max = Math.max(max, arr[m]-arr[m-a]);
                }
            }

            System.out.println(max);
        }

    }
}