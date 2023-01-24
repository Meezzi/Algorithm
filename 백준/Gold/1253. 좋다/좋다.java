import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);

        long cnt=0;

        for(int i=0; i<n; i++) {
            int start=0, end=n-1;
            long find=arr[i];
            while(start<end) {
                if(arr[start] + arr[end]==find) {
                    if(start!=i && end !=i) {
                        cnt++;
                        break;
                    } else if(start==i) {
                        start++;
                    } else {
                        end--;
                    }
                } else if(arr[start] + arr[end]>find) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        System.out.println(cnt);
    }
}