import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        double tmp = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String sub = st.nextToken();
            double cre = Double.parseDouble(st.nextToken());
            String gra = st.nextToken();



            switch (gra) {
                case "A+":
                    tmp += cre * 4.5;
                    break;
                case "A0":
                    tmp += cre * 4.0;
                    break;
                case "B+":
                    tmp += cre * 3.5;
                    break;
                case "B0":
                    tmp += cre * 3.0;
                    break;
                case "C+":
                    tmp += cre * 2.5;
                    break;
                case "C0":
                    tmp += cre * 2.0;
                    break;
                case "D+":
                    tmp += cre * 1.5;
                    break;
                case "D0":
                    tmp += cre;
                    break;
                case "F":
                    tmp += cre * 0.0;
                    break;
                case "P" :
                    continue;
            }
            sum += cre;
        }

        System.out.printf("%.6f", (tmp / sum));

        br.close();
    }
}