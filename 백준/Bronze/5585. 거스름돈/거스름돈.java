import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();
        int[] coin = {500, 100, 50, 10, 5, 1};
        money = 1000 - money;
        int cnt = 0;

        for(int i=0; i<5; i++) {
            cnt += money/coin[i];
            money = money%coin[i];
        }
        if(money != 0) {
            cnt += money;
        }

        System.out.print(cnt);
    }
}