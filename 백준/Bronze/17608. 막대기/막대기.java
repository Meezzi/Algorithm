import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int cnt = 1;

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int num = arr[n-1];
        for(int i=n-2; i>=0; i--) {
            if(num<arr[i]) {
                cnt++;
                num = arr[i];
            }
        }

        System.out.println(cnt);
    }
}