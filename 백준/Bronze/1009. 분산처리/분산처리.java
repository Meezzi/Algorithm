import java.math.BigInteger;
import java.util.*;
import java.io.*;

class Main {
    public static boolean prime[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int res = 1;

            for(int j=0; j<b; j++) {
                res = res * a;
                res %=10;
                if(Objects.equals(res, 0)) res = 10;
            }

            System.out.println(res);
        }
    }

}