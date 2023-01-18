import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        int res = 666;
        int cnt = 1;

        while (cnt != a) {
            res ++;
            if(String.valueOf(res).contains("666")) {
                cnt++;
            }
        }

        System.out.println(res);
    
    }
}