import java.io.*;
import java.util.*;

public class Bj_11256 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            ArrayList<Integer> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            for (int i=0; i<n; i++) {
                st = new StringTokenizer(br.readLine());
                int r = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                list.add(r*c);
            }
            list.sort(Collections.reverseOrder());
            int cnt = 0;
            for (int it : list) {
                cnt++;
                j -= it;
                if (j <= 0) {
                    sb.append(cnt).append("\n");
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}