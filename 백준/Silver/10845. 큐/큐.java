import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        int last = 0;

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String str = st.nextToken();


            switch (str) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    queue.add(num);
                    last = num;
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else sb.append(queue.poll() + "\n");
                    break;
                case "size":
                    sb.append(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) sb.append(1 + "\n");
                    else sb.append(0 + "\n");
                    break;
                case "front":
                    if (!queue.isEmpty()) {
                        sb.append(queue.peek() + "\n");
                    } else sb.append(-1 + "\n");
                    break;
                case "back":
                    if (queue.isEmpty()) sb.append(-1 + "\n");
                    else sb.append(last + "\n");
                    break;
            }

        }

        System.out.println(sb);
    }
}
