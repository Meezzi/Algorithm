import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 1;
        int cnt=1;
        int start=1;
        int end=1;

        while(end!=n) {
            if(sum==n) {
                cnt++;
                end++;
                sum = sum + end;
            } else if(sum>n) {
                sum = sum-start;
                start++;
            } else {
                end++;
                sum = sum + end;
            }
        }
        System.out.println(cnt);
    }
}