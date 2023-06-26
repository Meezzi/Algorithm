import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int tmp = 2;

        for(int i=0; i<n; i++) {
            tmp = tmp*2-1;
        }

        System.out.println(tmp*tmp);
    }
}