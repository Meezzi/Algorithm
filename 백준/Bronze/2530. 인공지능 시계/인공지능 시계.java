import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int t = Integer.parseInt(br.readLine());
        s = s+t;

        if(s>=60) {
            m = m + (s/60);
            s = s%60;

        }
        if(m>=60) {
            h = h + (m/60);
            m = m%60;

        }
        if(h>=24) {
            h = h%24;
        }

        System.out.print(h + " " + m + " " + s);

    }

}