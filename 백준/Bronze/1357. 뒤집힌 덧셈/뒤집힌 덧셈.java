import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int res = rev(a) + rev(b);
        System.out.println(rev(res));
    }

    public static int rev(int i) {
        if(i<10) {
            return i;
        }
        else if(i<100) {
            return (i/10) + (i%10)*10;
        }
        else if(i<1000) {
            return (i/100) + ((i/10)%10)*10 + (i%10)*100;
        }
        else {
            return (i/1000) + ((i/100)%10)*10 + ((i/10)%10)*100 + (i%10)*1000;
        }

    }
}
