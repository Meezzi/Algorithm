import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = 0;
        for(int i=0; i<a; i++) {
            b++;
            String[] arr = br.readLine().split(" ");
            Stack<String> stack = new Stack<>();
            int j=0;
            while(true) {
                stack.push(arr[j]);
                j++;
                if(j==arr.length) break;
            }
            System.out.print("Case #");

            System.out.print(b + ": ");
            for(int k=0; k<arr.length; k++) {
                String strpo = stack.pop();
                System.out.print(strpo + " ");
            }
            System.out.println();
        }
    }
}