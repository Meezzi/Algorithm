import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            int a = Integer.parseInt(br.readLine());

            int quter = a/25;
            int dime = a%25/10;
            int nickel = a%25%10/5;
            int penny = a%25%10%5;

            System.out.println(quter + " " + dime + " " + nickel + " " + penny);
        }
    }
}