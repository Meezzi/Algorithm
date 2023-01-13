import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String res = "";
        int cnt = 0;

        String[] arr = br.readLine().trim().split(" ");

        for(int i=0; i<arr.length; i++) {
            if(Integer.parseInt(arr[i])==i+1) {
                cnt ++;
            } else if (Integer.parseInt(arr[7-i]) == i+1) {
                cnt --;
            }
        }

        for(int i=0; i<arr.length; i++) {
            if(cnt == 8) res = "ascending";
            else if(cnt == -8) res = "descending";
            else res = "mixed";
        }

        System.out.print(res);

    }
}