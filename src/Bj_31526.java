import java.util.*;
import java.io.*;

public class Bj_31526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        long ans = r;
        int mod = 998244353;
        for (int i=0; i<c-1; i++) {
            ans = ans * (r-1) % mod;
        }
        System.out.print(ans);
    }
}