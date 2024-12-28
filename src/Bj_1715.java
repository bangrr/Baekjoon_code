import java.io.*;
import java.util.*;

public class Bj_1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int v = Integer.parseInt(br.readLine());
            pq.add(v);
        }

        int sum = 0;
        while (pq.size() > 1) {
            int h = pq.poll() + pq.poll();
            sum += h;
            pq.add(h);
        }
        System.out.print(sum);
    }
}
