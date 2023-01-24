import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int max = arr[0][0];
        int x=0, y=0;

        for(int i=0; i<arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<arr.length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]>max) {
                    max=arr[i][j];
                    x=i;
                    y=j;
                }

            }
        }
        System.out.println(max);
        System.out.println((x+1) + " " + (y+1));
    }
}