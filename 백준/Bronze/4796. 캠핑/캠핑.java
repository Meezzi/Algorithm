import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;

        while(true) {
            int l = sc.nextInt();
            int p = sc.nextInt();
            int v = sc.nextInt();

            if(l==0 && p==0 && v==0) break;
            int res = 0;

            res = l*(v/p);
            if(l<(v%p)) res+=l;
            else res+=(v%p);
            System.out.println("Case " + i + ": " + res);
            i+=1;
        }
    }
}