import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int tmp = 0;
        int c = 0, d = 0;

        for(int i=1; ; i++) {
            if(a<=i) { tmp = i; break; }
            a -= i;
        }

        for(int i=1, j=tmp; i<=a; i++, j--) {
            if(tmp%2==0) {
                c = i;
                d = j;
            }
            else {
                c = j;
                d = i;
            }
        }
        System.out.println(c+"/"+d);
    }
}