import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[6];
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] res = new int[6];

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<6; i++) {
            num[i] = sc.nextInt();
        }

        for(int i=0; i<6; i++) {
            res[i] = chess[i] - num[i];
            System.out.print(res[i] + " ");
        }
    }
}