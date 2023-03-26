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
        Stack<Integer> stack = new Stack<>();
        char[] arr = new char[str.length()];

        for(int i=0; i<str.length(); i++) {
            arr[i] = str.charAt(i);
            if(arr[i] == '(') {
                stack.push(1);
            } else if (arr[i] == '[') {
                stack.push(0);
            }

            else if((arr[i] == ']' || arr[i] == ')') && stack.empty()) {
                System.out.println("no");
                return;
            }
            else if (arr[i] == ')' && stack.peek()!=1) {
                System.out.println("no");
                return;
            }
            else if (arr[i] == ']' && stack.peek()!=0) {
                System.out.println("no");
                return;
            }

            else if(arr[i] == ')' && (stack.peek()==1)) {
                stack.pop();
            } else if(arr[i] == ']' && (stack.peek()==0)) {
                stack.pop();
            }
        }

        if(stack.empty()) System.out.println("yes");
        else System.out.println("no");



    }
}