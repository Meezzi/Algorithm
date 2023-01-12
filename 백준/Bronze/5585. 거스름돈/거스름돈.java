import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money = Integer.parseInt(br.readLine());
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