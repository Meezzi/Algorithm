import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        int[] res = new int[n+1];
        int max = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<n+1-k; i++) {
            res[i] = arr[i+k] - arr[i];
            max = Math.max(max, res[i]);
        }
        System.out.println(max);

    }
}