import java.io.*;
import java.util.*;

public class Bj_15080 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), ":");
        int h1 = Integer.parseInt(st.nextToken().trim());
        int m1 = Integer.parseInt(st.nextToken().trim());
        int s1 = Integer.parseInt(st.nextToken().trim());

        st = new StringTokenizer(br.readLine(), ":");
        int h2 = Integer.parseInt(st.nextToken().trim());
        int m2 = Integer.parseInt(st.nextToken().trim());
        int s2 = Integer.parseInt(st.nextToken().trim());

        int ans = (h2*3600 + m2*60 + s2) - (h1*3600 + m1*60 + s1);
        System.out.print(ans < 0 ? ans + 24*3600 : ans);
    }
}