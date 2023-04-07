import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int i = Integer.parseInt(br.readLine());

        System.out.print(strNum(str, i));
    }

    public static Character strNum(String str, int a) {
        Character[] arr = new Character[str.length()];

        for(int i=0; i<str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr[a-1];
    }
}