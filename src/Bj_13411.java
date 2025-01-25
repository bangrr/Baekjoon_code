import java.io.*;
import java.util.*;

public class Bj_13411 {
    public static class Something implements Comparable<Something> {
        double time;
        int num;

        public Something(double time, int num) {
            this.time = time;
            this.num = num;
        }

        @Override
        public int compareTo(Something o) {
            return Double.compare(this.time, o.time) == 0 ? this.num - o.num : Double.compare(this.time, o.time);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Something> pq = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            pq.add(new Something(Math.sqrt((x * x + y * y)) / v, i));
        }

        while (!pq.isEmpty()) {
            sb.append(pq.poll().num).append("\n");
        }
        System.out.print(sb);
    }
}
