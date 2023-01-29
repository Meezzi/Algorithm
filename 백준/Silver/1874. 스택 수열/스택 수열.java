import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];

        for(int i=0; i<a; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int num=1;
        boolean result = true;
        for(int i=0; i<arr.length; i++) {
            int su = arr[i];
            if(su>=num) {
                while(su>=num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }
            else {
                int n = stack.pop();
                if(n>su) {
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else {
                    bf.append("-\n");
                }
            }
        }
        if(result) System.out.println(bf.toString());

    }
}