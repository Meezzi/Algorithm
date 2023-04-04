import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        int sum = 0;

        for(int i=1; i<=b; i++) {
            for(int j=0; j<i; j++) {
                list.add(i);
            }
        }

        for(int i=a; i<=b; i++) {
            sum+=list.get(i-1);
        }

        System.out.println(sum);
    }
}