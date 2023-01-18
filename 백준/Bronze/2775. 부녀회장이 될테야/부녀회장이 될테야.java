import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i=0; i<a; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(live(k, n));
        }
    }

    static int live(int k, int n) {
        int sum = 0;
        int[][] arr = new int[k+1][n];

        for(int j=0; j<n; j++) {
            arr[0][j] = j+1;
        }

        for(int i=1; i<=k; i++) {
            sum = 0;
            for(int j=0; j<n; j++) {
                sum += arr[i-1][j];
                arr[i][j] = sum;
            }
        }

        return sum;
    }
}