import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

import static java.lang.Math.abs;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int abs = 0;

        abs = Math.min(abs(x-w), abs(y-h));
        abs = Math.min(abs, abs(x));
        abs = Math.min(abs, abs(y));

        System.out.print(abs);
    }
}