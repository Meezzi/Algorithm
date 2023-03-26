import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.print(stack(arr));

    }

    public static int stack(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                stack.push(arr[i]);
            } else if(arr[i] == 0) {
                stack.pop();
            }
        }

        int sum = 0;
        while(!stack.empty()) {
            sum += stack.peek();
            stack.pop();
        }

        return sum;
    }
}