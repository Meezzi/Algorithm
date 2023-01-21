import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrScore = new int[n];
        int max = 0;
        double sum = 0;

        for(int i=0; i<n; i++) {
            arrScore[i] = sc.nextInt();
            max = Math.max(max, arrScore[i]);
        }

        for(int i=0; i<n; i++) {
            sum += arrScore[i];
        }

        System.out.println(sum * 100.0 / max / n);

    }
}