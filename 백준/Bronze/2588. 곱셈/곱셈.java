import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int res1 = a*(b%10);
        int res2 = a*((b/10)%10);
        int res3 = a*(b/100);
        
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res1+(res2*10)+(res3*100));
                      
    }
}