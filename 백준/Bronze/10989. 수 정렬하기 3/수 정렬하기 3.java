import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        int[] cnt = new int[10001];

        for(int i=0; i<a; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<a; i++) {
            cnt[arr[i]]++;
        }

        for(int i=1; i<cnt.length; i++) {
            
            while(cnt[i] > 0) {
                sb.append(i).append('\n');
                cnt[i]--;
            }

        }

        System.out.print(sb);

    }


}