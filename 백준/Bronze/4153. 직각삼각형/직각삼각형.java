import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a==0 && b==0 && c==0) break;

            if (a*a == (b*b) + (c*c)) sb.append("right").append('\n');
            else if (b*b == (a*a) + (c*c)) sb.append("right").append('\n');
            else if (c*c == (b*b) + (a*a)) sb.append("right").append('\n');
            else sb.append("wrong").append('\n');
        }System.out.println(sb);
    }
}