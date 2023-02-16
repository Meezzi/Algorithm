import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<3; i++) {
            min = Math.min(min, arr[i] + arr[3] - 50);
        }

        for(int i=0; i<3; i++) {
            min = Math.min(min, arr[i] + arr[4] - 50);
        }

        System.out.println(min);
    }
}