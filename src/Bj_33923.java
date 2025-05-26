import java.io.*;
import java.util.*;

public class Bj_33923 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (n == m) {
            System.out.print((n - 2) * (n - 2) + 1);
        } else {
            int sml = Math.min(n - 1, m - 1);
            System.out.print(sml * sml);
        }
    }
}