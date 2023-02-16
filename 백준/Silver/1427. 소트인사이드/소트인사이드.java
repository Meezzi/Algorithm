import java.io.*;
import java.util.*;

class Main {
    int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] arr = new int[str.length()];

        for(int i=0; i<str.length(); i++) {
            arr[i] = str.charAt(i)-48;
        }
        selectionSort(arr);

        for(int i=0; i<arr.length; i++) System.out.print(arr[i]);

    }

    static void selectionSort(int[] arr) {

        for(int i=0; i<arr.length; i++) {
            int maxIdx = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[maxIdx] < arr[j]) {
                    maxIdx = j;
                }
            }
            int tmp=arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = tmp;
        }
    }
}