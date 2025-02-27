import java.io.*;
import java.util.*;

public class Bj_15780 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<k; i++) {
            n -= (Integer.parseInt(st.nextToken()) + 1) / 2;
        }
        System.out.print(n <= 0 ? "YES" : "NO");
    }
}