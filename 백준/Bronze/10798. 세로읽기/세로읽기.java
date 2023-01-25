import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arrStr = new char[5][15];
        int max = 0;

        for(int i=0; i<5; i++) {
            String str = br.readLine();
            if(max<str.length()) max = str.length();
            for(int j=0; j<str.length(); j++) {
                arrStr[i][j] = str.charAt(j);
            }
        }

        for(int i=0; i<max; i++) {
            for(int j=0; j<5; j++) {
                if(arrStr[j][i]=='\0') continue;
                System.out.print(arrStr[j][i]);
            }
        }

    }
}