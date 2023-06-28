import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        int width = Integer.parseInt(br.readLine());

        System.out.println(CalculateRectangle(length, width));
    }

    static int CalculateRectangle (int length, int width) {
        return length*width;
    }
}