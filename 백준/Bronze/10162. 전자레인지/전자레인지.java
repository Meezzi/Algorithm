import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] button = {300, 60, 10};
        int t = Integer.parseInt(br.readLine());

        if(t%10 != 0)
            System.out.print("-1");
        else {

            int a = t / button[0];
            t = t % button[0];
            int b = t / button[1];
            t = t % button[1];
            int c = t / button[2];

            System.out.print(a + " " + b + " " + c);
        }
    }
}