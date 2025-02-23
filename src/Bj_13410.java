import java.io.*;
import java.util.*;

public class Bj_13410 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int max = 0;
        for (int i = 1; i <= k; i++) {
            max = Math.max(max, Integer.parseInt(sb.append(i * n).reverse().toString()));
            sb.setLength(0);
        }
        System.out.print(max);
    }
}