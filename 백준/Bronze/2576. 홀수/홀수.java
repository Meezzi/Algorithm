import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[7];
        Boolean oddState = false;
        int sum = 0, min = 100;

        for(int i=0; i<7; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<7; i++) {
            oddState = odd(arr[i]);
            if(oddState) {
                sum += arr[i];
                min = Math.min(min, arr[i]);
            }
        }

        if(sum==0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static boolean odd(int i) {
        if(i%2==0) return false;
        else return true;
    }
}