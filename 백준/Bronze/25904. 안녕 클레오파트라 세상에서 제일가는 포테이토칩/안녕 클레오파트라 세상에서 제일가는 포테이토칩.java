import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int people = Integer.parseInt(st.nextToken());
        int voice = Integer.parseInt(st.nextToken());
        int[] arr = new int[people];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<people; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int i=0;
        while(true) {
            if(i>=people) {
                i=0;
            }

            if(voice>arr[i]) {
                System.out.println(i+1);
                break;
            }
            i++;
            voice++;
        }


    }
}