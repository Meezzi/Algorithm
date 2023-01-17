import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = n;

        for(int i=0; i<n; i++) {
            boolean[] b = new boolean[26];
            String s = br.readLine();

            b[(int)s.charAt(0)-97] = true;

            for(int j=1; j<s.length(); j++) {
                char c = s.charAt(j);
                if((int)c==(int)s.charAt(j-1)) continue;

                if(b[(int)c-97]) {
                    cnt--;
                    break;
                }
                b[(int)s.charAt(j)-97] = true;
            }
        }
        System.out.println(cnt);

    }
}