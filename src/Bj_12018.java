import java.io.*;
import java.util.*;

public class Bj_12018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            Integer[] arr = new Integer[p];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < p; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int ml;
            if (p < l) {
                ml = 1;
            } else {
                Arrays.sort(arr, Collections.reverseOrder());
                ml = arr[l-1];
            }
            pq.add(ml);
        }
        int sum = 0;
        int cnt = 0;
        while (!pq.isEmpty()) {
            int item = pq.poll();
            if (sum +  item > m) break;
            sum += item;
            cnt++;
        }
        System.out.print(cnt);
    }
}