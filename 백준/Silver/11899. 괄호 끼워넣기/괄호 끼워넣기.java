import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println(parenthesis(str));

    }

    public static int parenthesis(String str) {

        Stack<Character> stack = new Stack<>();
        int sum = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch== '(') {
                stack.push(ch);
            } else if (ch==')' && !stack.empty()) {
                stack.pop();
            } else {
                sum++;
            }
        }


        while(!stack.empty()) {
            stack.pop();
            sum++;
        }


        return sum;

    }
}
