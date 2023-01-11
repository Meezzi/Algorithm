import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String res = String.valueOf(a*b*c);
        String[] str = res.split("");

        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++) {
            int cnt=0;
            for(int j=0; j<str.length; j++) {
                if(Integer.parseInt(str[j]) == i) {
                    cnt++;
                }
            }
            arr[i] = cnt;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}