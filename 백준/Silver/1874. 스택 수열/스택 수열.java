import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        boolean res = true;

        for(int i=0; i<a; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        int num=1;
        for(int i=0; i<a; i++) {
            int su = arr[i];
            if(su>=num) {
                while(su>=num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int n = stack.pop();
                if(n>su) {
                    System.out.println("NO");
                    res = false;
                    break;
                } else {
                    sb.append("-\n");
                }

            }
        }
        if(res) System.out.println(sb);

    }
}