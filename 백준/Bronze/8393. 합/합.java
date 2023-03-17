import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1=Integer.parseInt(br.readLine());
        int sum=0;

        for(int i=1; i<=num1; i++) {
            sum += i;
        }

        System.out.println(sum);

    }

}