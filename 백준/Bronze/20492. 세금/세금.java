import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        System.out.print((int)(a-(a*0.22)) + " " + (int)(a*0.8 + ((a*0.2)-((a*0.2) * 0.22))));
    }
}
