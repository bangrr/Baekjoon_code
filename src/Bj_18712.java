import java.util.*;
import java.io.*;

public class Bj_18712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n][2];
            for (int i=0; i<2; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<n; j++) {
                    arr[j][i] = Integer.parseInt(st.nextToken());
                }
            }

            Arrays.sort(arr, (o1, o2) -> {
                return o1[0] != o2[0] ? o1[0]-o2[0] : o2[1]-o1[1];
            });

            long ans = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i=0; i<n; i++) {
                if (arr[i][0] <= arr[k-1][0]) {
                    pq.add(-arr[i][1]);
                }
            }
            for (int i=0; i<k; i++) {
                ans += -pq.poll();
            }
            sb.append(arr[k-1][0]).append(" ").append(ans).append("\n");
        }
        System.out.print(sb);
    }
}