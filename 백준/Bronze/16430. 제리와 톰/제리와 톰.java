import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int i=2, res1 = b-a, res2 =b;
        while(i<b) {
            if(b%i==0 && (b-a)%i==0) {
                res1 = (b-a)/i;
                res2 = b/i;
            }

            i++;
        }

        System.out.println(res1 + " " + res2);

    }
}