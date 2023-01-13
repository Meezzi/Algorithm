import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String res = "";
        int cnt = 0;
        int[] arr = new int[8];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i]==i+1) {
                cnt ++;
            } else if (arr[7-i] == i+1) {
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