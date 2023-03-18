import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int dice1 = Integer.parseInt(st.nextToken());
        int dice2 = Integer.parseInt(st.nextToken());
        int dice3 = Integer.parseInt(st.nextToken());
        int top=0;

        if(dice1 == dice2 && dice2 == dice3) {
            System.out.print(10000+dice1*1000);
        }

        else if (dice1 == dice2 && dice1 != dice3) {
            System.out.print(1000+dice1*100);
        }
        else if (dice2==dice3 && dice2 != dice1) {
            System.out.print(1000+dice2*100);
        }
        else if (dice1==dice3 && dice2 != dice1) {
            System.out.print(1000+dice1*100);
        }
        else {
            top = Math.max(Math.max(dice1, dice2), dice3);

            System.out.print(top*100);
        }

    }
}