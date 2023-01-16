import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int cnt = 0;

        for(int i=0; i<a; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0; i<a; i++) {
            for(int j=0; j<i; j++) {
                cnt += arr[j];
            }
            cnt += arr[i];
        }

        System.out.print(cnt);
    }
}