import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            int a = Integer.parseInt(br.readLine());

            sb.append(a/25).append(" ");

            a%=25;
            sb.append(a/10).append(" ");

            a%=10;
            sb.append(a/5).append(" ");

            a%=5;
            sb.append(a).append(" ");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}