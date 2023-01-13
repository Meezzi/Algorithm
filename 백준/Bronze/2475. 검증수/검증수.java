import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().trim().split(" ");
        int sum =0;

        for(int i=0; i<arr.length; i++) {
            sum += Integer.parseInt(arr[i]) * Integer.parseInt(arr[i]);
        }

        System.out.print(sum%10);
    }
}