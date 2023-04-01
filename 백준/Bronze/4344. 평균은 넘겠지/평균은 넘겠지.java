import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int c = Integer.parseInt(br.readLine());

        for(int i=0; i<c; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int t = Integer.parseInt(st.nextToken());
            int[] stu = new int[t];

            double sum = 0;
            int cnt =0;
            double avg = 0;

            for(int j=0; j<t; j++) {
                stu[j] = Integer.parseInt(st.nextToken());
                sum += stu[j];
                avg = (sum/t);
            }
            for(int j=0; j<t; j++) {
                if(avg<stu[j]) {
                    cnt ++;
                }
            }
            double res = cnt*(100.0/t);
            String ress = String.format("%.3f", res);
            System.out.println(ress+ "%");
        }
    }
}