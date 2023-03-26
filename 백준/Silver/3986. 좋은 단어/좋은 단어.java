import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=0; i<n; i++) {
            String str = br.readLine();
            sum += stack(str);
        }
        System.out.println(sum);

    }

    public static int stack(String str) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);

            if(c=='A') {
                if(stack.empty() || stack.peek()=='B') stack.push('A');
                else stack.pop();
            } else {
                if(stack.empty() || stack.peek()=='A') stack.push('B');
                else stack.pop();
            }
        }

        if(stack.empty()) return 1;
        else return 0;
    }
}