import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = br.readLine();
            if(Objects.equals(str, ".")) break;
            stack(str);
        }

    }

    public static void stack(String str) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c == '(' || c == '[') {
                stack.push(c);
            } 
            
            
            else if(c==')') {
                if(stack.empty() || stack.peek()!='(') {
                    System.out.println("no");
                    return;
                } else stack.pop();

            } 
            
            else if (c==']') {
                if(stack.empty() || stack.peek() !='[') {
                    System.out.println("no");
                    return;
                } else stack.pop();
            }
        }

        if(stack.empty()) System.out.println("yes");
        else System.out.println("no");

    }
}