import java.io.*;
import java.util.*;

public class Bj_30009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int a = 0, b = 0;
        for (int i=0; i<n; i++) {
            int t = Integer.parseInt(br.readLine());
            if (x-r < t && t < x+r) {
                a++;
            } else if (x-r == t || t == x+r) {
                b++;
            }
        }
        System.out.print(a + " " + b);
    }
}