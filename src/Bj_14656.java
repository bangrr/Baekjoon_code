import java.io.*;
import java.util.*;

public class Bj_14656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a != i) cnt++;
        }
        System.out.print(cnt);
    }
}