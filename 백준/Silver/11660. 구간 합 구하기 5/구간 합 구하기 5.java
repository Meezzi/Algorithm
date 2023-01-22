import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[m+1][m+1];

        for(int i=1; i<=m; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=m; j++) {
                arr[i][j] = arr[i][j-1] + arr[i-1][j] - arr[i-1][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int sum = arr[x2][y2] - arr[x2][y1-1] - arr[x1-1][y2] + arr[x1-1][y1-1];

            if(x1==x2 && y1==y2)
                sum = arr[x1][y1] - arr[x1][y1-1] - arr[x1-1][y1] + arr[x1-1][y1-1];
            if(x1==1 && y1==1 && x2==m && y2==m)
                sum = arr[x2][y2];
            System.out.println(sum);
        }
    }
}