import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.print(word(str));
    }

    public static String word(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb= new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);

            if(c=='<') {

                while(!stack.empty()) {
                    sb.append(stack.peek());
                    stack.pop();
                }

                while(true) {
                    c=str.charAt(i);
                    if(c=='>') {
                        sb.append(c);
                        break;
                    }
                    sb.append(c);
                    i++;
                }



            } else if(c==' ') {
                while(!stack.empty()) {
                    sb.append(stack.peek());
                    stack.pop();
                }
                sb.append(' ');
            } else if (i==str.length()-1) {
                stack.push(c);
                while(!stack.empty()) {
                    sb.append(stack.peek());
                    stack.pop();
                }
            }

            else {
                stack.push(c);
            }
        }
        return sb.toString();
    }
}