import java.io.*;
import java.util.*;

public class Bj_34934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int y = Integer.parseInt(st.nextToken());
            if (y == 2026) {
                System.out.print(s);
                return;
            }
        }
    }
}