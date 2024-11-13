import java.io.*;
import java.util.*;

public class Bj_32627 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];
        String s = br.readLine();
        for (int i = 0; i < n; i++) {
            arr[i][0] = s.charAt(i) - 'a';
            arr[i][1] = i;
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });
        for (int i = 0; i < m; i++) {
            arr[i][0] = -1;
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        for (int i = 0; i < n; i++) {
            if (arr[i][0] > -1) {
                sb.append((char)(arr[i][0] + 'a'));
            }
        }
        System.out.print(sb);
    }
}