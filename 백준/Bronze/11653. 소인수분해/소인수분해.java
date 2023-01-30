import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int i=2;

        while(true) {
            if(a==1 || a==0) break;

            if(a%i==0) {
                a = a/i;
                System.out.println(i);
            }
            else {
                i += 1;
            }
        }
    }

}