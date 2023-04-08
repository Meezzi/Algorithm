import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];

        for(int i=1; i<=n; i++) arr[i] = i;

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            busket(arr, a, b, c);
        }

        for(int i=1; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void busket(int[] arr, int a, int b, int c) {
        int k = 0;
        int l = 0;

        int[] arrCopy = new int[arr.length];
        for(int i=0; i<arr.length; i++) arrCopy[i] = arr[i];

        for(int i=a; i<=b; i++) {
            if(c+k<=b) {
                arr[i] = arr[c+k];
                k++;
            } else {
                arr[i] = arrCopy[a+l];
                l++;
            }

        }
    }
}