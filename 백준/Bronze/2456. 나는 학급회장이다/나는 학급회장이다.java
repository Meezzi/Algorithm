import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int [][] arr = new int [4][4];
        
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            arr[1][sc.nextInt()]++;
            arr[2][sc.nextInt()]++;
            arr[3][sc.nextInt()]++;

        }

        int tempMax = -1;
        int maxCount = 0; 
        int chk = 0;
        int numb = -1;

        for (int i = 1; i <= 3; i++) {
            int sum = arr[i][1]+2*arr[i][2]+3*arr[i][3];
            if (sum>tempMax) {
                tempMax = sum;
                maxCount++;
                numb = i;
            }else if (sum==tempMax) {

                if (arr[numb][3]<arr[i][3]) {
                    numb = i;
                    chk = 0;
                }else if (arr[numb][3]==arr[i][3] && arr[numb][2]<arr[i][2]) {
                    numb = i;
                    chk = 0;
                }else if (arr[numb][3]==arr[i][3] && arr[numb][2]==arr[i][2]) {
                    chk = 1;
                }
            }


        }
        if (chk ==0) {
            System.out.println(numb+" "+tempMax);
        }else {
            numb=0;
            System.out.println(numb+" "+tempMax);
        }
    }
}