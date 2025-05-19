import java.io.*;
import java.util.*;

public class Bj_33846 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[] alpha = new int[t];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<t; i++) {
            alpha[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(alpha);
        for (int it : alpha) {
            sb.append(it).append(" ");
        }

        for (int i=t; i<n; i++) {
            sb.append(Integer.parseInt(st.nextToken())).append(" ");
        }
        System.out.print(sb);
    }
}