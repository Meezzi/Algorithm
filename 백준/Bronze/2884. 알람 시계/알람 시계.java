import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        if(m<45) {
            h=h-1;
            m=m+15;
        }
        else {
            m=m-45;
        }
        if(h==-1) {
            h=23;
        }
        System.out.print(h+" "+m);
    }
}