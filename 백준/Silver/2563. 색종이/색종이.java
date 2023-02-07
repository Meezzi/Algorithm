import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] white = new int[100][100];
        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for(int j=a; j<a+10; j++) {
                for(int k=b; k<b+10; k++) {
                    white[j][k] = 1;
                }
            }
        }

        int cnt = 0;
        for(int i=0; i<white.length; i++) {
            for(int j=0; j<white.length; j++) {
                if(white[i][j] == 1) cnt++;
            }
        }

        System.out.println(cnt);



    }
}