import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[11];
        int score = 0;

        for(int i=1; i<arr.length; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(br.readLine());

        }

        for(int i=1; i<arr.length; i++) {
            if(arr[i]>=100) {
                if(100-arr[i-1] >= arr[i]-100) {
                    score = arr[i];
                } else {
                    score = arr[i-1];
                }
                break;
            }
            else {
                score = arr[i];
            }
        }

        System.out.println(score);

    }
}