import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(x(N));
    }

    public static int x(int N) {
        int res = 0;
        int[] a = new int[4];

        for(int i=1; i<N+1; i++) {
            if(i<100) {
                res += 1;
            }
            else {
                if((i/100) - (i/10)%10 == (i/10)%10 - (i%10)) {
                    res +=1;
                }
            }
        }
        return res;
    }

}