import java.io.*;
import java.util.*;

public class Bj_27965 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long a = 1;
        for (int i=2; i<=n; i++) {
            int len = String.valueOf(i).length();
            a = (a * (long)Math.pow(10, len) + i) % k;
        }
        System.out.print(a%k);
    }
}