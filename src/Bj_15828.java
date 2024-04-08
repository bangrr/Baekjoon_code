import java.io.*;
import java.util.*;

public class Bj_15828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        while (true) {
            int i = Integer.parseInt(br.readLine());
            if (i == -1) break;
            if (i == 0 && !q.isEmpty()) q.poll();
            else if (q.size() < n) q.add(i);
        }
        if (q.isEmpty()) {
            sb.append("empty");
        } else {
            while (!q.isEmpty()) sb.append(q.poll()).append(" ");
        }
        System.out.print(sb);
    }
}