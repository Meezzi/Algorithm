import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = 1;
        int d = 1;

        for(int i=0; i<b; i++) {
            c *= (a-i);
        }

        for(int i=0; i<b; i++) {
            d *= (b-i);
        }


        System.out.print(c/d);


    }


}