import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());

        A = new ArrayList[node + 1];
        visited = new boolean[node + 1];

        for (int i = 1; i < node + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);
        }

        int cnt = 0;
        for (int i = 1; i < node + 1; i++) {
            if (!visited[i]) {
                cnt++;
                DFS(i);
            }
        }

        System.out.print(cnt);
    }

    static void DFS(int v) {
        if(visited[v]) return;
        visited[v] = true;

        for(int i: A[v]) {
            if(!visited[i]) DFS(i);
        }
    }
}