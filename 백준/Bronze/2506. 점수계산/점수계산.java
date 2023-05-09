import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a+1];

        int sum = 0;
        int tmp = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if(arr[i] == 1) {
                if(arr[i-1]==1) {
                    tmp += 1;
                } else tmp=0;
                sum += arr[i] + tmp;
            }

        }

        System.out.println(sum);



    }
}