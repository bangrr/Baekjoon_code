import java.io.*;
import java.util.*;

public class Bj_25644 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int ans = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            int a = Integer.parseInt(st.nextToken());
            min = Math.min(min, a);
            ans = Math.max(ans, a-min);
        }
        System.out.print(ans);
    }
}