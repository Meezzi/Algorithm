import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int cnt=0, sum=0;
        int start=0, end=n-1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        while(start<end) {
            if(arr[start] + arr[end]==m) {
                cnt++;
                start++;
                end--;
            } else if(arr[start] + arr[end]>m) {
                end--;
            } else {
                start++;
            }
        }
        System.out.println(cnt);
    }
}