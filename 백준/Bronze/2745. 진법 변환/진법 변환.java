import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int res = 0;


        for(int i=0; i<n.length(); i++) {
            char a = n.charAt(i);
            int tmp = 0;

            switch(a) {
                case 'A' : tmp = 10; break;
                case 'B' : tmp = 11; break;
                case 'C' : tmp = 12; break;
                case 'D' : tmp = 13; break;
                case 'E' : tmp = 14; break;
                case 'F' : tmp = 15; break;
                case 'G' : tmp = 16; break;
                case 'H' : tmp = 17; break;
                case 'I' : tmp = 18; break;
                case 'J' : tmp = 19; break;
                case 'K' : tmp = 20; break;
                case 'L' : tmp = 21; break;
                case 'M' : tmp = 22; break;
                case 'N' : tmp = 23; break;
                case 'O' : tmp = 24; break;
                case 'P' : tmp = 25; break;
                case 'Q' : tmp = 26; break;
                case 'R' : tmp = 27; break;
                case 'S' : tmp = 28; break;
                case 'T' : tmp = 29; break;
                case 'U' : tmp = 30; break;
                case 'V' : tmp = 31; break;
                case 'W' : tmp = 32; break;
                case 'X' : tmp = 33; break;
                case 'Y' : tmp = 34; break;
                case 'Z' : tmp = 35; break;
                default : tmp = a-48;

            }

            res += Math.pow(b, (n.length()-i-1)) * tmp;
        }
        System.out.println(res);

        br.close();
    }
}