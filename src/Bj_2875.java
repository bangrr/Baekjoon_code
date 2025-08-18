import java.io.*;
import java.util.*;

public class Bj_2875 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        while (k-- > 0) {
            if (n >= m * 2) {
                n--;
            } else {
                m--;
            }
        }
        System.out.print(Math.min(n/2, m));
    }
}