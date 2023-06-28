import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        System.out.println(SumAngle(a, b, c));
    }

    static String SumAngle (int a, int b, int c) {
        int sum = a+b+c;
        if(a==60 && b==60 && c==60) {
            return "Equilateral";
        } else if (sum==180) {
            if(a!=b && a!=c && b!=c) return "Scalene";
            else return "Isosceles";
        } else  return "Error";
    }
}