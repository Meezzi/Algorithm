import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int i=1;
        int cnt=0;
        int res = 0;

        while(i<=a) {
            if(a%i==0) {
                cnt++;
                if(cnt==b) {
                    res = i;
                    break;
                }
            }
            i++;
        }

        System.out.print(res);
    }

}