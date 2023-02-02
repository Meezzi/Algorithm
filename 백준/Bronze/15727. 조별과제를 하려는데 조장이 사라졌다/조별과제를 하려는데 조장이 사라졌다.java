import java.io.*;
import java.util.*;
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
 
        while(true) {
            n -= 5;
            cnt++;
            if(n<=0) {
                System.out.print(cnt);
                break;
            }
 
        }
    }
}