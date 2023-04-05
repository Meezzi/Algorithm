import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] res = new int[a][b];
        int[][] arr = new int[a][b];
        int[][] brr = new int[a][b];

        for(int i=0; i<a; i++) {
            for(int j=0; j<b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<a; i++) {
            for(int j=0; j<b; j++) {
                brr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<a; i++) {
            for(int j=0; j<b; j++) {
                res[i][j] = arr[i][j] + brr[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }


    }
}