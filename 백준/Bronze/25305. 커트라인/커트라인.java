import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[a];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        insertionSort(arr);
        System.out.println(arr[a-b]);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 선택 데이터
            int key = arr[i];
            //비교 데이터
            int j = i - 1;

            // 이전의 원소가 더 크다면 데이터는 하나씩 밀려난다.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}