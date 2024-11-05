import java.io.*;
import java.util.*;

public class Bj_32612 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        double ans = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int x = Integer.parseInt(st.nextToken());
            ans += ((x+1)/2.0);
        }
        System.out.print(ans);
    }
}