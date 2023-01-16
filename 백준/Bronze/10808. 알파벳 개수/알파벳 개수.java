import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] arr = new int[26];

        for(int j=0; j<str.length(); j++) {
            for(char i='a'; i<='z'; i++) {
                if(str.charAt(j) == i) {
                    arr[(int)i - 97] +=1;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}