import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int cnt = 0;


        for(int i=0; i<a; i++) {
            String str = br.readLine();
            sb.append(stack(str)+'\n');
        }
        System.out.println(sb);

    }

    public static String stack(String s) {
        Stack<String> stack = new Stack<>();
        String[] arr = s.split("");

        for(int i=0; i<arr.length; i++) {
            if(Objects.equals(arr[i], "(")) {
                stack.push(arr[i]);
            } else if(stack.empty()) {
                return "NO";
            } else {
                stack.pop();
            }

        }

        if(stack.empty()) return "YES";
        else return "NO";
    }
}