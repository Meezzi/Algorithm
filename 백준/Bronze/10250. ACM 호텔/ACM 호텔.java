import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        for(int i=0; i<a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int x, y;

            if(n%h==0) {
                sb.append((h*100) + (n/h)).append('\n');
            }
            else sb.append(((n%h) * 100) + ((n/h) + 1)).append('\n');
            
        }System.out.print(sb);
    }
}