import java.io.*;
import java.util.*;

public class Bj_2774 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            boolean[] visited = new boolean[10];
            while (x > 0) {
                visited[x % 10] = true;
                x /= 10;
            }
            int cnt = 0;
            for (boolean b : visited) {
                if (b) cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}
