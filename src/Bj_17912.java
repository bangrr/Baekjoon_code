import java.io.*;
import java.util.*;

public class Bj_17912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.MAX_VALUE;
        int d = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a < m) {
                m = a;
                d = i;
            }
        }
        System.out.print(d);
    }
}