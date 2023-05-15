import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if(a<2) {
            System.out.print("Before");
        } else if (a==2) {
            if(b<18) {
                System.out.print("Before");
            } else if (b==18) {
                System.out.println("Special");
            } else System.out.println("After");
        } else System.out.println("After");



    }
}