import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int star = Integer.parseInt(br.readLine());

        printStart(star);
    }

    public static void printStart(int star) {
        double res = 0.0;

        for(int i=1; i<=star; i++) {
            for(int j=0; j<star-i; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
