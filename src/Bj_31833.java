import java.io.*;
import java.util.*;

public class Bj_31833 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            sb.append(st.nextToken());
        }
        long a = Long.parseLong(sb.toString());

        sb.setLength(0);
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            sb.append(st.nextToken());
        }
        long b = Long.parseLong(sb.toString());

        System.out.print(Math.min(a, b));
    }
}
